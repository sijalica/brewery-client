package com.course.breweryclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class BreweryClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BreweryClientApplication.class, args);
	}

}
