package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.HSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class HSController {
	
	@Autowired
	private HSService hsService;
	
	
	//연락처 삭제하기
	@DeleteMapping("/api/hsdelete/{aNo}")
	public JsonResult addressDelete(@PathVariable(value="aNo") int aNo) {
		System.out.println("HSController.addressDelete()");
		
		int count = hsService.addressDelete(aNo);
		
		return JsonResult.success(count);
	}
	
	//연락처 한 명 선택하기(상세정보)
	@GetMapping("/api/hsdetail/{aNo}")
	public JsonResult getDetail(@PathVariable(value="aNo") int aNo) {
		System.out.println("HSController.getDetail()");
		
		List<AddressVo> dList = hsService.getDetail(aNo);

		System.out.println("여기확인"+ dList);
		return JsonResult.success(dList);
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
	
	
	// 수정
	@PutMapping(value = "/api/hsModify")
	public JsonResult modify(@RequestBody AddressVo addressVo) {
		System.out.println("HSController.modify");
		System.out.println("즐겨찾기하자`~~~~");
		System.out.println(addressVo);
		int count = hsService.exeModify(addressVo);

		return JsonResult.success(count);
	}
}
