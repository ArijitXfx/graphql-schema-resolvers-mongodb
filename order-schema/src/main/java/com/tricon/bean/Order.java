package com.tricon.bean;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Document
public class Order {
	@Id
	private String id;
	private String custId;
	private String productId;
	private Customer customer;
	private Product product;
	
	public Order(String id, String custId) {
		this.id = id;
		this.custId = custId;
	}
}
