package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YsDao;
import com.javaex.vo.AddressVo;

@Service
public class YSService {
	
	@Autowired
	private YsDao ysDao;
	
	//수정폼 리스트 불러오기
	public List<AddressVo> exeList() {
		System.out.println("YSService.exeList");
		
		List<AddressVo> ysList =ysDao.getList();
		
		return ysList;
	}
}
