package com.interview.uuid.uuidservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages= {"com.interview.uuid.controller", "com.interview.uuid.service"})
public class UuidServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UuidServiceApplication.class, args);
	}

}

