package com.spring_depend_inj.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CityConfig {
	
	@Bean
	LanguageDetails getLang() {
		return new LanguageDetails();
	}
	
	@Bean(value = "hyd_data")
	Hyderabad getHyderabad(LanguageDetails getLang) {
		return new Hyderabad(getLang);
	}
	
	@Bean(value = "bza_data")
	Vijayawada getVijayawada(LanguageDetails getLang) {
		return new Vijayawada(getLang);
	}

}
