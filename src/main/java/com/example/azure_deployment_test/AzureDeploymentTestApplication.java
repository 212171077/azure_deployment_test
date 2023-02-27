package com.example.azure_deployment_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class AzureDeploymentTestApplication {

	public static void main(String[] args) {
		SpringApplication.run(AzureDeploymentTestApplication.class, args);
	}

	@GetMapping("/hello")
	public String toString() {
		return "Build web, including RESTful";
	}
}
