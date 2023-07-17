package com.school.management;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
public class ManagementApplication {



	public static void main(String[] args) {
		SpringApplication.run(ManagementApplication.class, args);
	}

//	@GetMapping
//	public List<String> getUsers() {
//		return List.of("Hello", "World");
//	}

//	@RequestMapping("/users")
//	public class User() {
//		return "Hello World";
//	}

}
