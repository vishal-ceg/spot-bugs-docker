package com.test.spotbugsdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class HelloController {
	
	@GetMapping("/msg") //vulnerability: static text
	public String getMsg() {
		return "Hello controller";
	}

}
