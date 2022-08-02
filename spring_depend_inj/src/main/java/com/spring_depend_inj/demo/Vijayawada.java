package com.spring_depend_inj.demo;

public class Vijayawada {
	
	LanguageDetails lang; //dependency injection

	public Vijayawada(LanguageDetails lang) {  // dependency injection
		System.out.println("Constructor @ Vijayawada");
		this.lang = lang;
	}

	public void getStateName() {
		System.out.println("Hyderabad in Andhra Pradesh");
		lang.getVijayawadaCode();  // dependency injection
		
	}
}
