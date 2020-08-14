package com.groupchallenge.co2tracker.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.allianz.co2tracker.model.Customer;
import com.allianz.co2tracker.repository.CustomerRepository;

@Repository
public class CustomerDaoImpl implements CustomerDao {
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public List<Customer> getCustomers() {
		return customerRepository.findAll();
	}

	@Override
	public void save(Customer customer) {
		customerRepository.save(customer);
	}

}
