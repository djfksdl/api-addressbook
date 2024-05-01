package com.javaex.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.HSDao;

@Service
public class HSService {
	
	@Autowired
	private HSDao hsDao;
	
	
	public void getList() {
		System.out.println("HSService.getList()");
		
		hsDao.selectList();
	}

}
