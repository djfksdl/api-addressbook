package com.javaex.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.YSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class YSController {
	
	@Autowired
	private YSService ysService;
	
	//즐겨찾기 리스트 불러오기
	@GetMapping("/api/ysGetList")
	public JsonResult ysgetList() {
		System.out.println("YSController.ysgetList");
		
		List<AddressVo> ysList =ysService.exeList();
		
		System.out.println(ysList);
		return JsonResult.success(ysList);
	}
	
	//수정폼- 한사람 그룹리스트정보 가져오기
	@GetMapping("/api/ysGetVo/{aNo}")
	public JsonResult ysGetVoByaNo(@PathVariable(value = "aNo")int aNo) {
		System.out.println("YSController.ysGetVoByaNo");
		
//		System.out.println("찍혀야함"+aNo);
		
		List<AddressVo> mgList = ysService.exeVo(aNo);

//		System.out.println("내가 찍은거:" + mgList);
		return JsonResult.success(mgList);
	}
	
	//수정하기
	@PutMapping("/api/ysUpdate")
	public JsonResult ysUpdate(@RequestBody AddressVo addressVo) {
		System.out.println("YSController.ysUpdate");
		
		System.out.println("들어왔나?:"+ addressVo);
		ysService.exeUpdate(addressVo);
		
		
		return JsonResult.success("**수정하기 성공**");
				
	}
}
