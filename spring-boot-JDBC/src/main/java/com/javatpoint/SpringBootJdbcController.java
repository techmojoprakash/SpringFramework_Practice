package com.javatpoint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootJdbcController {
	@Autowired
	JdbcTemplate jdbc;
	
	@GetMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email)values('javatpoint','java@javatpoint.com')");
		return"data inserted Successfully";
	}
	
}


// Ref : https://www.javatpoint.com/spring-boot-jdbc-example
