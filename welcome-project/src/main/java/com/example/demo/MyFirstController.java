package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/welcome")


public class MyFirstController {
	@GetMapping
	public String welcomeMessage() {
		return "<h1>Hello..! Spring boot</h1>";
	}
}

// Reference : https://www.youtube.com/watch?v=fy7TYk_ljCM