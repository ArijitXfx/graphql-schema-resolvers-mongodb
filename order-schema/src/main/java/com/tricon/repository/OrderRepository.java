package com.tricon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tricon.bean.Order;

public interface OrderRepository extends MongoRepository<Order, String>{

}
