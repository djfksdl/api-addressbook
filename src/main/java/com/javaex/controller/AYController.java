package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.AYService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class AYController {
	
	@Autowired
	private AYService ayService;
	
	@GetMapping("/api/ay")
	public JsonResult getList() {
		System.out.println("AYController.getList");
		
		List<AddressVo> addressList= ayService.exeList();
		
		
		return JsonResult.success(addressList);
	}
}
