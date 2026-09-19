package com.shubh.springbootTut;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@SpringBootApplication
@ConfigurationPropertiesScan
public class SpringbootTutApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootTutApplication.class, args);
	}

	public SpringbootTutApplication(UserService userService) {
		this.userService = userService;
	}

	private final UserService userService;
	@Override
	public void run(String... args) throws Exception {
		userService.saveUser("shubh");

	}
}
