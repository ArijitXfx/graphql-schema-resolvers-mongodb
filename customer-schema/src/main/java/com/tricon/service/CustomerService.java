package com.tricon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.bean.Customer;
import com.tricon.repository.CustomerRepository;

@Service
public class CustomerService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Customer> getAllCutomers(){
		return customerRepository.findAll();
	}
	
	public Customer getCustomerById(String id) {
		return customerRepository.findById(id).orElseThrow(()->new RuntimeException("Customer with id:"+id+" not found!"));
	}
	
	public Customer saveCustomer(String id, String email, String password) {
		return customerRepository.save(new Customer(id,email,password));
	}
	
	public Customer updateCustomer(String id, String email, String password) {
		Customer customer = getCustomerById(id);
		customer.setEmail(email);
		customer.setPassword(password);
		return customerRepository.save(customer);
	}
	
	public String deleteCustomer(String id) {
		Customer customer = getCustomerById(id);
		customerRepository.delete(customer);
		return "Deleted Successfully";
	}
}
