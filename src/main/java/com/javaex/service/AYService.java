package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.AYDao;
import com.javaex.vo.AddressVo;

@Service
public class AYService {
	
	@Autowired
	private AYDao ayDao;
	

	public List<AddressVo> exeList() {
		System.out.println("AYService.exeList");
		
		List<AddressVo> addressList= ayDao.selectList();
		
		return addressList;
		
	}
	
}
