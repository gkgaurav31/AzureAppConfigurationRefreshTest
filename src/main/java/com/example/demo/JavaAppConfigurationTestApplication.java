package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(MessageProperties.class)
public class JavaAppConfigurationTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(JavaAppConfigurationTestApplication.class, args);
	}

}
