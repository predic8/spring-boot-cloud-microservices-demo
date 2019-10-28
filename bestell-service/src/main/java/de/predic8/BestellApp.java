package de.predic8;

import org.springframework.boot.autoconfigure.*;
import org.springframework.cloud.client.loadbalancer.*;
import org.springframework.cloud.openfeign.*;
import org.springframework.context.annotation.*;
import org.springframework.retry.annotation.*;
import org.springframework.web.client.*;

import static org.springframework.boot.SpringApplication.*;

@SpringBootApplication
@EnableFeignClients
@EnableRetry
public class BestellApp {

    @Bean
    @LoadBalanced
    RestTemplate rest() { return new RestTemplate();}

	public static void main(String[] args) {
        run(BestellApp.class, args);
	}

}
