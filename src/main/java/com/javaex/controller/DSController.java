package com.javaex.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaex.service.DSService;
import com.javaex.util.JsonResult;
import com.javaex.vo.AddressVo;

@RestController
public class DSController {
	
	@Autowired
	private DSService dsService;
	
	//수정폼 - 1개 데이터 가져오기
	@GetMapping("api/dsGroupedit/{cNo}")
	public JsonResult groupEditForm(@PathVariable(value="cNo") int cNo) {
		System.out.println("DSController.groupEditForm()");
		
		System.out.println("---------컨트롤러 앞--------"+cNo);
		
		AddressVo aVo=dsService.exeEditForm(cNo);
		
		System.out.println("---------컨트롤러 뒤--------"+aVo);
		
		return JsonResult.success(aVo);
	}
	
	//수정
	@PutMapping("api/dsGroupedit/{cNo}")
	public JsonResult groupEdit(@PathVariable(value="cNo") int cNo,
								@RequestBody AddressVo aVo) {
		System.out.println("DSController.groupEdit()");
		
		aVo.setcNo(cNo);
		
		System.out.println("num= "+cNo);
		
		int count=dsService.exeEdit(aVo);
		
		return JsonResult.success(count);
	}
	
	//테스트
	@GetMapping("/api/ds")
	public void getList() {
		System.out.println("DSController.getList");
	}
}
