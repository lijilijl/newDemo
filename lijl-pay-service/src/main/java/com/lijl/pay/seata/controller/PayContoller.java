package com.lijl.pay.seata.controller;

import com.lijl.pay.seata.service.PayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/pay")
public class PayContoller {
	@Autowired
	private PayService payService;
	@GetMapping("/savepay")
	public String pay(){
		payService.savePay();
		return "success";
	}
}
