package com.tricon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tricon.bean.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String>{

}
