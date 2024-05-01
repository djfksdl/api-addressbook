package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.JHDao;
import com.javaex.vo.AddressVo;

@Service
public class JHService {

	@Autowired
	private JHDao jhDao;
	
	public List<AddressVo> exepersoninsertgruoptList() {
		System.out.println("JHService.exepersoninsertgruoptList");
		
		
		List<AddressVo> persongroupList =jhDao.PersonGroupList();
		
		return persongroupList;
	}
	
	public int exePersongroupinsert(AddressVo addressVo) {
		System.out.println("JHService.exePersongroupinsert");
		
		int count = jhDao.PersonGroupsinsert(addressVo);
		
		return count;
	}
	
}
