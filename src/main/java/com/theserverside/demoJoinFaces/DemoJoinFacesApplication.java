package com.theserverside.demoJoinFaces;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.theserverside.demoJoinFaces.domain.Customer;
import com.theserverside.demoJoinFaces.repository.CustomerRepository;

@SpringBootApplication
@EnableScheduling
public class DemoJoinFacesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoJoinFacesApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner demo(CustomerRepository repository) {
		return (args) -> {
			// save a couple of customers
			repository.save(new Customer("Jack", "Bauer"));
			repository.save(new Customer("Chloe", "O'Brian"));
			repository.save(new Customer("Kim", "Bauer"));
			repository.save(new Customer("David", "Palmer"));
			repository.save(new Customer("Michelle", "Dessler"));

		};
	}
}
