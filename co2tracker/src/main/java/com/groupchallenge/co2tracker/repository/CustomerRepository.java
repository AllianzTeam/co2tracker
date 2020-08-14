package com.groupchallenge.co2tracker.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.allianz.co2tracker.model.Customer;

public interface CustomerRepository {
	List<Customer> findAll();

}
