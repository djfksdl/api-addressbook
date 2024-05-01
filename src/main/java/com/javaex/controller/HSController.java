package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.HSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class HSController {
	
	@Autowired
	private HSService hsService;
	
	//한명 선택하기(상세정보)
	@GetMapping("/api/hsdetail/{aNo}")
	public JsonResult getDetail(@PathVariable(value="aNo") int aNo) {
		System.out.println("HSController.getDetail()");
		
		AddressVo addressVo = hsService.getDetail(aNo);

		return JsonResult.success(addressVo);
	}
	
	//리스트 불러오기
	@GetMapping("/api/hsaddresslist")
	public JsonResult getAddressList() {
		System.out.println("HSController.getAddressList");
		
		//서비스(aNo, name, gender)
		List<AddressVo> hsList = hsService.getList();
		System.out.println(hsList);
		
		return JsonResult.success(hsList);
	}
}
