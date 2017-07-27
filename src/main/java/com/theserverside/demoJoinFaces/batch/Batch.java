package com.theserverside.demoJoinFaces.batch;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.theserverside.demoJoinFaces.domain.Customer;
import com.theserverside.demoJoinFaces.repository.CustomerRepository;

@Component
@Slf4j
public class Batch {
	
	@Autowired
	CustomerRepository repository;
	
	@Scheduled(fixedRate = 10000)
    public void lanciaBatch() {
		

		log.info("Customers found with findAll():");
		log.info("-------------------------------");
		for (Customer customer : repository.findAll()) {
			log.info(customer.toString());
		}
		log.info("--------------------------------");

	}

}

