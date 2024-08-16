package org.microservice.test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class MicroserviceTest1Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceTest1Application.class, args);
	}

}
