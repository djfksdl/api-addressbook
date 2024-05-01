package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.HSDao;
import com.javaex.vo.AddressVo;

@Service
public class HSService {
	
	@Autowired
	private HSDao hsDao;
	
	
	public List<AddressVo> getList() {
		System.out.println("HSService.getList()");
		
		List<AddressVo> hsList = hsDao.selectList();
		
		return hsList;
	}

}
