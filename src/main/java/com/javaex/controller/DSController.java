package com.javaex.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DSController {
	
	@GetMapping("/api/ds")
	public void getList() {
		System.out.println("DSController.getList");
	}
}
