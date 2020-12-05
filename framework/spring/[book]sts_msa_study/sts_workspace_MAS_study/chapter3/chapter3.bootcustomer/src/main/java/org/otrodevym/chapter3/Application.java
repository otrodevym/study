package org.otrodevym.chapter3;

import java.util.Optional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitMessagingTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Lazy;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import reactor.core.publisher.Mono;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	CommandLineRunner init(CustomerRepository repo) {
		return (evt) -> {
			repo.save(new Customer("Adam", "dam@boot.com"));
			repo.save(new Customer("John", "john@boot.com"));
			repo.save(new Customer("Smith", "smith@boot.com"));
			repo.save(new Customer("Edgar", "edgar@boot.com"));
			repo.save(new Customer("Martin", "martin@boot.com"));
			repo.save(new Customer("Tom", "tom@boot.com"));
			repo.save(new Customer("Sean", "sean@boot.com"));
		};

	}
}

@RestController
class CustomerContoller {
	@Autowired
	CustomerRegistrar customerRegistrar;

	@RequestMapping(path = "/register", method = RequestMethod.POST)
	Mono<Customer> register(@RequestBody Customer customer) {
		return customerRegistrar.register(customer);
	}
}

@Lazy
@Component
class CustomerRegistrar {
	CustomerRepository customerRespository;

	Sender sender;

	@Autowired
	public CustomerRegistrar(CustomerRepository customerRepository, Sender sender) {
		this.customerRespository = customerRepository;
		this.sender = sender;
	}

	public Mono<Customer> register(Customer customer) {
		if (customerRespository.findByName(customer.getName()).isPresent()) {
			System.out.println("Duplicate Customer. No Action required");
		} else {
			customerRespository.save(customer);
			sender.send(customer.getEmail());
		}
		return Mono.just(customer);
	}
}

@Component
@Lazy
class Sender {
	@Autowired
	RabbitMessagingTemplate template;

	@Bean
	Queue queue() {
		return new Queue("CustomerQ", false);
	}

	public void send(String message) {
		template.convertAndSend("CustomerQ", message);
	}
}


@RepositoryRestResource
interface CustomerRepository extends JpaRepository<Customer, Long> {
	Optional<Customer> findByName(@Param("name") String name);
}

@Entity
class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;

	private String email;

	public Customer() {
	}

	public Customer(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}