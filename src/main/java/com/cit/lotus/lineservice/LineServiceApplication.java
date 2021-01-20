package com.cit.lotus.lineservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LineServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(LineServiceApplication.class, args);
	}

}
