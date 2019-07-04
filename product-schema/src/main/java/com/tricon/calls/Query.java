package com.tricon.calls;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.tricon.bean.Product;
import com.tricon.service.ProductService;

@Component
public class Query implements GraphQLQueryResolver{
	
	@Autowired
	private ProductService productService;
	
	public List<Product> getAllProducts(){
		return productService.getAllProducts();
	}
	
	public Product getProductById(String id) {
		return productService.getProductById(id);
	}
}
