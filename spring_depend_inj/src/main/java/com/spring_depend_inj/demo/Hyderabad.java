package com.spring_depend_inj.demo;

public class Hyderabad {
	
	LanguageDetails lang; // dependency injection
	
	public Hyderabad(LanguageDetails lang) {  // dependency injection
		System.out.println("Constructor @ Hyderabad");
		this.lang = lang;
	}

	public void getStateName() {
		System.out.println("Hyderabad in Telangana");
		lang.getHyderabadCode();  // dependency injection
		
	}

}
