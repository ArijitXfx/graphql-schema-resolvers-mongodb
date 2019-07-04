package com.tricon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.bean.Product;
import com.tricon.repository.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository productRepository;
	
	public List<Product> getAllProducts(){
		return productRepository.findAll();
	}
	
	public Product getProductById(String id) {
		return productRepository.findById(id).orElseThrow(()->new RuntimeException("Product id:"+id+" not found!"));
	}
}
