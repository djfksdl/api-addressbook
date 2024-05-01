package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.JHService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class JHController {
	
	@Autowired
	private JHService jhService;
	
	@GetMapping("/api/jh")
	public JsonResult personinsertgruoptList() {
		System.out.println("JHController.personinsertgruoptList");
		
		List<AddressVo> persongroupList = jhService.exepersoninsertgruoptList();
		
		System.out.println(persongroupList);
		
		return JsonResult.success(persongroupList);
		
	}
	
	//주소_그룹 테이블 등록
	@PostMapping("/api/jh/persongroupinsert")
	public JsonResult persongroupinsert(@RequestBody AddressVo addressVo) {
		System.out.println("JHController.persongroupinsert");
		
		int count = jhService.exePersongroupinsert(addressVo);
		
		return JsonResult.success(count);
	}
	
}
