package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.JHService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;


@RestController
public class JHController {
	
	@Autowired
	private JHService jhService;
	
	//그룹리스트
	@GetMapping("/api/jh")
	public JsonResult personinsertgruoptList() {
		System.out.println("JHController.personinsertgruoptList");
		
		List<AddressVo> persongroupList = jhService.exepersoninsertgruoptList();
		
		System.out.println(persongroupList);
		
		return JsonResult.success(persongroupList);
		
	}
	
	//등록
	@PostMapping("/api/jh/personwriteinsert")
	public JsonResult personwriteinsert(@RequestBody AddressVo addressVo) {
		System.out.println("JHController.persongroupinsert");
		
		System.out.println(addressVo);
		
		jhService.exePersonwriteinsert(addressVo);
		
		
		return JsonResult.success("야호");
	}
	
	
	
	
	
}
