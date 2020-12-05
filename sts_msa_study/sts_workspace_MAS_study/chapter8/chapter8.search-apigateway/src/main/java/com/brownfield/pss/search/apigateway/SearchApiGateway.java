package com.brownfield.pss.search.apigateway;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@EnableCircuitBreaker
@EnableZuulProxy
@EnableDiscoveryClient
@SpringBootApplication
public class SearchApiGateway {

    private static final Logger logger = LoggerFactory.getLogger(SearchApiGateway.class);

//    @Autowired
//    private RestTemplate restTempate;

    public static void main(String[] args) {
        SpringApplication.run(SearchApiGateway.class, args);
    }

    /*
     * @RequestMapping("/hubongw") String getHub(HttpServletRequest req) { logger.
     * info("Search Request in API gateway for getting Hub, forwarding to search-service "
     * );
     * 
     * String hub = restTempate.getForObject("http://search-service/search/hub",
     * String.class);
     * 
     * logger.info("response for hub received, Hub " + hub);
     * 
     * return hub; }
     * 
     * @RequestMapping("/hub") String getHub() {
     * logger.info("Searching for Hub, received from search-apigateway"); return
     * "SFO"; }
     */

}

@RestController
class SearchAPIGatewayController {
    private static final Logger logger = LoggerFactory.getLogger(SearchAPIGatewayController.class);

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    SearchAPIGatewayComponent component;

    @RequestMapping("/")
    String greet(HttpServletRequest req) {
        logger.info("Response for Gateway received");
        return "<H1>Search Gateway Powered By Zuul</H1>";
    }

    @RequestMapping("/hubongw")
    String getHub(HttpServletRequest req) {
        logger.info(
                " [Hystrix enabled] Search Request in API gateway for getting Hub, forwarding to search-service - ");
        return component.getHub();
    }

}

@Component
class SearchAPIGatewayComponent {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "getDefaultHub")
    public String getHub() {
        String hub = restTemplate.getForObject("http://search-service/search/hub", String.class);
        return hub;
    }

    public String getDefaultHub() {
        return "Possibily SFO";
    }
}

@Configuration
class AppConfiguration {
    @LoadBalanced
    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}