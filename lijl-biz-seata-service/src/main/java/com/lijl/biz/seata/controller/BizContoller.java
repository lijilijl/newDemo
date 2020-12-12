package com.lijl.biz.seata.controller;

import com.lijl.biz.seata.service.BizService;
import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/biz")
@EnableAdminServer
public class BizContoller {
	@Autowired
	private BizService bizService;
	@GetMapping("/save")
	public String toInsert(){
		bizService.save();
		return "success";
	}
}
