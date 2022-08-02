package com.spring_ioc.project;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringIocProjectApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringIocProjectApplication.class, args);
		
		// spring bean container
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringIocProjectApplication.class);
		
		Mobile mob_obj = context.getBean("samsung",Mobile.class);
		mob_obj.getMobileName();
		context.close();
	}

}
