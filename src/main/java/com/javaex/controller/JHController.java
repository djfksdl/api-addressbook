package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.JHService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class JHController {
	
	@Autowired
	private JHService jhService;
	
	@GetMapping("/api/jh")
	public JsonResult getList2() {
		System.out.println("JHController.getList");
		
		List<AddressVo> ysList =jhService.exeList2();
		
		System.out.println(ysList);
		
		return JsonResult.success(ysList);
		
	}
}
