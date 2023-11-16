package com.valtech.training.firstspringboot.controllers;

import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.valtech.training.firstspringboot.models.OrderModel;
import com.valtech.training.firstspringboot.service.OrderService;

@Controller
@RequestMapping(path = "/orders")
public class OrderController {
	
	@Autowired
	private OrderService orderService;
	
	@GetMapping(path = "/edit")
	public String editOrder(@RequestParam("id") long id, Model model) {
		
		model.addAttribute("orders", new OrderModel(orderService.getOrder(id)));
		return "orders/new";
	}
	
	@GetMapping(path = "/delete")
	public String deleteOrder(@RequestParam("id") long id, Model model) {
		
		model.addAttribute("orders", orderService.getAllOrders().stream().map(o -> new OrderModel(o)).collect(Collectors.toList()));
		return "orders/list";
	}
	
	@PostMapping(path = "/save", params = "cancel")
	public String cancelOrder(Model model) {
		
		model.addAttribute("orders", orderService.getAllOrders().stream().map(o -> new OrderModel(o)).collect(Collectors.toList()));
		return "orders/list";
	}
	
	
	@PostMapping("/save")
	public String saveOrder(@ModelAttribute OrderModel orderModel,@RequestParam("submit") String submit,Model model) {
		
		if(submit.equals("Create")) {
			orderService.createOrder(orderModel.getOrder());
		}
		else {
			return "orders/list";
		}
		model.addAttribute("orders",orderService.getAllOrders().stream().map(o -> new OrderModel(o)).collect(Collectors.toList()));
		return "orders/list";
	}
	
	@GetMapping(path = "/new")
	public String newOrder(Model model) {
		
		model.addAttribute("orders", new OrderModel());
		return "orders/new";
	}

	@GetMapping(path = "/list")
	public String listOrder(Model model) {
		
		model.addAttribute("orders",orderService.getAllOrders().stream().map(o -> new OrderModel(o)).collect(Collectors.toList()));
		return "orders/list";
	}
	
	
}
