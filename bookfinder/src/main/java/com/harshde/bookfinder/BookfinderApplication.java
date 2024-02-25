package com.harshde.bookfinder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.harshde.bookfinder.services.*")
public class BookfinderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookfinderApplication.class, args);
	}

}
