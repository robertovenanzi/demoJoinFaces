package com.theserverside.demoJoinFaces.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.theserverside.demoJoinFaces.domain.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

    List<Customer> findByLastName(String lastName);
}
