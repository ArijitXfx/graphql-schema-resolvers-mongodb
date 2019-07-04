package com.tricon.calls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.tricon.bean.Customer;
import com.tricon.service.CustomerService;

@Component
public class Mutation implements GraphQLMutationResolver{
	
	@Autowired
	private CustomerService customerService;
	
	public Customer saveCustomer(String id, String email, String password) {
		return customerService.saveCustomer(id, email, password);
	}
	
	public String deleteCustomer(String id) {
		return customerService.deleteCustomer(id);
	}
	
	public Customer updateCustomer(String id, String email, String password) {
		return customerService.updateCustomer(id, email, password);
	}
}
