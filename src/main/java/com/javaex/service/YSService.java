package com.javaex.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javaex.dao.YSDao;
import com.javaex.vo.AddressVo;

@Service
public class YSService {
	
	@Autowired
	private YSDao ysDao;
	
	//즐겨찾기 리스트 불러오기
	public List<AddressVo> exeList() {
		System.out.println("YSService.exeList");
		
		List<AddressVo> ysList =ysDao.getList();
		
		return ysList;
	}
	
	//수정폼- 한사람 정보 가져오기
	public AddressVo exeVo(int aNo) {
		System.out.println("YSService.exeVo");
		
		AddressVo mVo = ysDao.getInfoByaNo(aNo);
		
		return mVo;
		
		
	}
}
