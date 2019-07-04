package com.tricon.calls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tricon.bean.Customer;
import com.tricon.service.CustomerService;

@Component
public class Query implements GraphQLQueryResolver{

	@Autowired
	private CustomerService customerService;
	
	public List<Customer> getAllCustomers(){
		return customerService.getAllCutomers();
	}
	
	public Customer getCustomerById(String id) {
		return customerService.getCustomerById(id);
	}
}
