package com.groupchallenge.co2tracker.dao;

import java.util.List;

import com.allianz.co2tracker.model.Customer;

public interface CustomerDao {
	List<Customer> getCustomers();
	void save(Customer customer);
}
