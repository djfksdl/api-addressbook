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
	public List<AddressVo> exeVo(int aNo) {
		System.out.println("YSService.exeVo");
		
		List<AddressVo> mgList = ysDao.getInfoByaNo(aNo);
		
		return mgList;
		
	}
	
	//수정하기
	public void exeUpdate(AddressVo addressVo) {
		System.out.println("YSService.exeUpdate");
		
		//수정하기-address table
		ysDao.updateAll(addressVo);
		
		//수정하기-그룹리스트
		if(addressVo.getGroupNoList().length <= 0) {
			addressVo.setcNo(0);
			ysDao.categoryGroupAllList(addressVo);
			
		}else {
			for(int i = 0; i < addressVo.getGroupNoList().length; i++) {
				addressVo.setcNo(addressVo.getGroupNoList()[i]);
				ysDao.categoryGroupAllList(addressVo);
			}
		}
	}
}
