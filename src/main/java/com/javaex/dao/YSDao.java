package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AddressVo;

@Repository
public class YSDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//즐겨찾기 리스트 불러오기
	public List<AddressVo> getList() {
		System.out.println("YSDao.getList");
		
		List<AddressVo> ysList = sqlSession.selectList("ysbook.selectList");
		
		return ysList;
		
	}
	
	//수정폼- 한사람 정보 가져오기
	public List<AddressVo> getInfoByaNo(int aNo) {
		System.out.println("YSDao.getInfoByaNo");
		
		List<AddressVo> mgList = sqlSession.selectList("ysbook.selectListByaNo", aNo);
		
		return mgList;
	}
	
	//수정하기
	public void updateAll(AddressVo addressVo) {
		System.out.println("YSDao.exeUpdate");
		
		sqlSession.update("ysbook.updatemform",addressVo);
		
	}
}
