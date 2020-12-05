package org.otrodevym.chapter3;

import java.util.Calendar;
import java.util.concurrent.atomic.LongAdder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.metrics.CounterService;
import org.springframework.boot.actuate.metrics.GaugeService;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}

@RestController
class GreetingController {
	private static final Logger logger = LoggerFactory.getLogger(GreetingController.class);

	TPSHealth health;
	CounterService counterService;
	GaugeService gaugeService;

	@Autowired
	GreetingController(TPSHealth health, CounterService counterService, GaugeService gaugeService) {
		this.health = health;
		this.counterService = counterService;
		this.gaugeService = gaugeService;
	}

	@CrossOrigin
	@RequestMapping("/")
	Greet greet() {
		logger.info("Serving Request....!!!");
		health.updateTx();
		this.counterService.increment("greet.txnCount");
		this.gaugeService.submit("greet.customgauge", 1.0);
		return new Greet("Hello World!");
	}
}

class Greet {
	private String message;

	public Greet() {
	}

	public Greet(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}

class TPSCounter {
	LongAdder count;
	int threshold = 2;
	Calendar expiry = null;

	public TPSCounter() {
		this.count = new LongAdder();
		this.expiry = Calendar.getInstance();
		this.expiry.add(Calendar.MINUTE, 1);
	}

	boolean isExpired() {
		return Calendar.getInstance().after(expiry);
	}

	boolean isWeak() {
		return (count.intValue() > threshold);
	}

	void increment() {
		count.increment();
	}
}

@Component
class TPSHealth implements HealthIndicator {
	TPSCounter counter;

	@Override
	public Health health() {
		boolean health = counter.isWeak();
		if (health) {
			return Health.outOfService().withDetail("Too many requests", "OutofService").build();
		}
		return Health.up().build();
	}

	void updateTx() {
		if (counter == null || counter.isExpired()) {
			counter = new TPSCounter();
		}
		counter.increment();
	}

}