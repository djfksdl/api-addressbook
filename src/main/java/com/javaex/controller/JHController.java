package com.javaex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JHController {
	
	@GetMapping("/api/js")
	public void getList() {
		System.out.println("JHController.getList");
	}
}
