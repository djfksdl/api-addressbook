package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.DSDao;
import com.javaex.vo.AddressVo;

@Service
public class DSService {
	
	@Autowired
	private DSDao dsDao;
	
	//수정폼 - 1개 데이터 가져오기
	public AddressVo exeEditForm(int cNo) {
		System.out.println("DSService.exeEditForm()");
		
		System.out.println("---------서비스 앞--------"+cNo);
		
		AddressVo aVo=dsDao.selectOneGroup(cNo);

		System.out.println("---------서비스 뒤--------"+aVo);
		
		return aVo;
	}
	
	//수정
	public int exeEdit(AddressVo aVo) {
		System.out.println("DSService.exeEdit()");
		
		int count=dsDao.updateGroupName(aVo);
		System.out.println("service= "+aVo);
		
		return count;
	}

}
