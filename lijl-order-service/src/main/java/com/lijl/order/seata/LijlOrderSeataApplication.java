package com.lijl.order.seata;

import io.seata.rm.datasource.DataSourceProxy;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication

public class LijlOrderSeataApplication {

	public static void main(String[] args) {
		SpringApplication.run(LijlOrderSeataApplication.class, args);
	}

	/*@Bean
	public JdbcTemplate jdbcTemplate(DataSource dataSource){
		return new JdbcTemplate(new DataSourceProxy(dataSource) );
	}*/
}
