package com.spring_ioc.project;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	MedicalStudent getMedicalStudent() {
		return new MedicalStudent();
	}
	
	@Bean(name = "enggstudent")
	EnggStudent getEnggStudent() {
		return new EnggStudent();
	}

}
