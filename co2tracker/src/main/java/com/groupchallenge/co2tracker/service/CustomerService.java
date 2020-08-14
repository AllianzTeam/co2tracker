package com.allianz.co2tracker.service;

import java.util.List;

import com.allianz.co2tracker.bean.CustomerBean;

public interface CustomerService {
	List<CustomerBean> getCustomers();
	void save(CustomerBean customerBean);
}
