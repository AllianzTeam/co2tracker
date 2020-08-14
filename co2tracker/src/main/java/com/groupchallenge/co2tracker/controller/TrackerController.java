package com.groupchallenge.co2tracker.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.groupchallenge.co2tracker.bean.CustomerBean;
import com.groupchallenge.co2tracker.service.CustomerService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/tracker")
@Api(description = "Service for tracking CO2")
public class TrackerController {
	private static final Logger LOGGER = LoggerFactory.getLogger(TrackerController.class);

	@Autowired
	private CustomerService customerService;

	@ApiOperation(value = "Getting All Customers")
	@RequestMapping(method = RequestMethod.GET)
	public List<CustomerBean> getCustomers() {
		LOGGER.debug("Getting Customers");
		return customerService.getCustomers();
	}

	@ApiOperation(value = "Creating a Customer")
	@RequestMapping(method = RequestMethod.POST)
	public String save(@RequestBody CustomerBean customerBean) {
		customerService.save(customerBean);
		return "Customer Saved";
	}
}
