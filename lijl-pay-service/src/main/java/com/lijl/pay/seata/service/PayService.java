package com.lijl.pay.seata.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PayService {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Transactional
	public void savePay(){
		jdbcTemplate.update("INSERT INTO `pay`.`pay` (`name`) VALUES ('lijl_pay');");
	}
}
