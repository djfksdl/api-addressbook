package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.DSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class DSController {
	
	@Autowired
	private DSService dsService;
	
	//수정폼 - 1개 데이터 가져오기
	@GetMapping("api/dsGroupedit")
	public JsonResult groupEditForm() {
		System.out.println("DSController.groupEditForm()");
		
		int no=1;
		
		AddressVo aVo=dsService.exeEditForm(no);
		System.out.println(aVo);
		
		return JsonResult.success(aVo);
	}
	
	//수정
//	@PutMapping("api/dsGroupedit")
//	public int groupEdit(AddressVo aVo) {
//		System.out.println("DSController.groupEdit()");
//		
//		int no=aVo.getcNo();
//		System.out.println(no);
//		
//		int count=dsService.exeEdit(aVo);
//		
//		return count;
//	}
	
	//테스트
	@GetMapping("/api/ds")
	public void getList() {
		System.out.println("DSController.getList");
	}
}
