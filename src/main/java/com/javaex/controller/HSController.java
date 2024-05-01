package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.HSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class HSController {
	
	@Autowired
	private HSService hsService;
	
	//한명 선택하기(상세정보)
	//(aNo, cNo, acNo, name, hp, gender, email, memo, favorite, cName)
	
	//리스트 불러오기
	@GetMapping("/api/hs")
	public JsonResult getList() {
		System.out.println("HSController.getList");
		
		//서비스(aNo, name, gender)
		List<AddressVo> hsList = hsService.getList();
		System.out.println(hsList);
		
		return JsonResult.success(hsList);
	}
}
