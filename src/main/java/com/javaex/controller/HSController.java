package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.HSService;

@RestController
public class HSController {
	
	@Autowired
	private HSService hsService;
	
	//한명 선택하기(상세정보)
	//(aNo, cNo, acNo, name, hp, gender, email, memo, favorite, cName)
	
	//리스트 불러오기
	@GetMapping("/api/hs")
	public void getList() {
		System.out.println("HSController.getList");
		
		//서비스(aNo, name, gender)
		hsService.getList();
	}
}
