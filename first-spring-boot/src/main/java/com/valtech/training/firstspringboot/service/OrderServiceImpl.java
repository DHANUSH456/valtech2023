package com.valtech.training.firstspringboot.service;
 
import java.time.LocalDate;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
 
import com.valtech.training.firstspringboot.entity.*;
import com.valtech.training.firstspringboot.repository.*;
 
@Service
@Transactional(propagation=Propagation.REQUIRED)
public class OrderServiceImpl implements OrderService {
	
	@Autowired
	private OrderRepo orderRepo;
	
	@PostConstruct
	public void populateOrders() {
		
		orderRepo.save(new Order("Mackbook",25,"For Entrie Team",LocalDate.of(2023, 9, 6)));
		orderRepo.save(new Order("Iphone",2,"For personal use",LocalDate.of(2023, 9, 6)));
		orderRepo.save(new Order("Washing Machine",1,"Washing Cloths",LocalDate.of(2023, 9, 6)));
	}
	
	@Override
	public Order createOrder(Order order) {
		System.out.println(orderRepo.getClass().getName());
		return orderRepo.save(order);
	}
	
	@Override
	public Order updateOrder(Order order) {
		return orderRepo.save(order);
	}
	
	@Override
	public Order getOrder(long orderId) {
		return orderRepo.getReferenceById(orderId);
	}
	
	@Override
	public List<Order> getAllOrders(){
		return orderRepo.findAll();
	}
}
 