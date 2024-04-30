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
	
	public List<AddressVo> exeList2() {
		System.out.println("YSService.exeList");
		
		List<AddressVo> ysList =jhDao.getList2();
		
		return ysList;
	}
	
}
