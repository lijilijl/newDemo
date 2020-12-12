package com.lijl.order.seata.controller;

import com.lijl.order.seata.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/order")
public class OrderContoller {
	@Autowired
	private OrderService orderServic;
	@GetMapping("/saveorder")
	public String order(){
		orderServic.saveOrder();
		return "success";
	}
}
