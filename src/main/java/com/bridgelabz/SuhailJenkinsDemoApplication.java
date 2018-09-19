package com.bridgelabz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SuhailJenkinsDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuhailJenkinsDemoApplication.class, args);
	}

	@GetMapping("/")
	public String displayMessage() {
		return "Hello World";	
	}
}
