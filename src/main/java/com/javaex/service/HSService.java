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
	
	
	//연락처 삭제
	public int addressDelete(int aNo) {
		System.out.println("HSService.addressDelete()");
		
		hsDao.addressDelete2(aNo);
		int count = hsDao.addressDelete(aNo);
		
		
		return count;
	}
	
	//한 명 선택 상세정보
	public List<AddressVo> getDetail(int aNo) {
		System.out.println("HSService.getDetail()");
		
		//(aNo, cNo, acNo, name, hp, gender, email, memo, favorite, cName)
		// 1. 주소에 있는 정보 모두 가져오기
		List<AddressVo> dList = hsDao.selectAddress(aNo);
		
		return dList;
	}
	
	
	//리스트
	public List<AddressVo> getList() {
		System.out.println("HSService.getList()");
		
		List<AddressVo> hsList = hsDao.selectList();
		
		return hsList;
	}
	
	// 수정
	public int exeModify(AddressVo addressVo) {
		System.out.println("HSService.exeModify()");

		int count = hsDao.favoriteUpdate(addressVo);

		return count;
	}

}
