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
	
	//그룹리스트
	public List<AddressVo> exepersoninsertgruoptList() {
		System.out.println("JHService.exepersoninsertgruoptList");
		
		
		List<AddressVo> persongroupList =jhDao.PersonGroupList();
		
		return persongroupList;
	}
	
	//등록
	public void exePersonwriteinsert(AddressVo addressVo) {
		System.out.println("JHService.exePersonwriteinsert");
		
		jhDao.PersonAddresswrite(addressVo);
		
		if(addressVo.getGroupNoList().length <= 0) {
			addressVo.setcNo(0);
			jhDao.PersonGroupAllList(addressVo);
			
		}else {
			for(int i = 0; i < addressVo.getGroupNoList().length; i++) {
				addressVo.setcNo(addressVo.getGroupNoList()[i]);
				jhDao.PersonGroupAllList(addressVo);
			}
		}
		
		
		System.out.println(addressVo.getcNo());
		
		
	}
	
	
	
}
