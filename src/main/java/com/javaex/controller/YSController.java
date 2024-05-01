package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.YSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class YSController {
	
	@Autowired
	private YSService ysService;
	
	@GetMapping("/api/ysGetList")
	public JsonResult getList() {
		System.out.println("YSController.getList");
		
		List<AddressVo> ysList =ysService.exeList();
		
		System.out.println(ysList);
		return JsonResult.success(ysList);
		
		
	}
}
