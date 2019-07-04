package com.tricon.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.tricon.bean.Product;

public interface ProductRepository extends MongoRepository<Product, String> {

}
