/*
 * Hyderabad.java and Vijayawada.java two classes and CityConfig is confugaration class.
 * LanguageDetails is 3rd party class, but called Lang methods inside Hyd and BZA classes
 * by using Dependency Injection methodology
 * 
 */

package com.spring_depend_inj.demo;

//import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringDependInjApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringDependInjApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CityConfig.class);
		Hyderabad hyd_city = context.getBean("hyd_data", Hyderabad.class);
		hyd_city.getStateName();
		
		Vijayawada bza_city = context.getBean("bza_data", Vijayawada.class);
		bza_city.getStateName();
		
		context.close();
		
	}

}
