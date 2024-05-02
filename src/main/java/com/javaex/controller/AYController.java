package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.AYService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class AYController {
	
	@Autowired
	private AYService ayService;
	
	@GetMapping("/api/ayList")
	public JsonResult ayGetList() {
		System.out.println("AYController.ayGetList");
		
		List<AddressVo> addressList= ayService.exeList();
		System.out.println(addressList);
		
		
		return JsonResult.success(addressList);
	}
	
	
	@GetMapping("/api/ayList/{cNo}")
	public JsonResult getAddressList(@PathVariable(value="cNo") int cNo) {
		System.out.println("AYController.getAddressList");
		
		List<AddressVo> addressList= ayService.exeAddressList(cNo);
		
		return JsonResult.success(addressList);
	}
	
	@PostMapping("/api/ayInsert")
	public JsonResult getAddressList(@RequestParam(value="cName") String cName) {
		System.out.println("AYController.Insert");
	
		ayService.exeInsert(cName);
	
		return JsonResult.success(cName);
	}
			
}
