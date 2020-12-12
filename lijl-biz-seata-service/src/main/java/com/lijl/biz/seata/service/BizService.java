package com.lijl.biz.seata.service;

import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
public class BizService {
	@Autowired
	RestTemplate restTemplate;
	@GlobalTransactional
	public void save(){
		restTemplate.getForObject("http://localhost:1911/pay/savepay",String.class);
		restTemplate.getForObject("http://localhost:1910/order/saveorder",String.class);
		int i = 1/0;
	}

}
