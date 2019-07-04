package com.tricon.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tricon.bean.Order;
import com.tricon.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
	
	public List<Order> getAllCutomers(){
		return orderRepository.findAll();
	}
	
	public Order getOrderById(String id) {
		return orderRepository.findById(id).orElseThrow(()->new RuntimeException("Order with id:"+id+" not found!"));
	}
	
	public Order saveOrder(String id, String custId) {
		return orderRepository.save(new Order(id,custId));
	}
	
	public Order updateOrder(String id, String custId) {
		Order order = getOrderById(id);
		order.setCustId(custId);
		return orderRepository.save(order);
	}
	
	public String deleteOrder(String id) {
		Order Order = getOrderById(id);
		orderRepository.delete(Order);
		return "Deleted Successfully";
	}
}
