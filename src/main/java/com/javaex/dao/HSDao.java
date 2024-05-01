package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AddressVo;

@Repository
public class HSDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	
	//
	public AddressVo selectAddress(int aNo) {
		System.out.println("HSDao.selectAddress()");
		
		AddressVo addressVo = sqlSession.selectOne("hsbook.selectOneAddress", aNo);
		
		return addressVo;
	}
	
	//리스트
	public List<AddressVo> selectList() {
		System.out.println("HSDao.selectList()");
		
		List<AddressVo> hsList = sqlSession.selectList("hsbook.selectList");
		
		return hsList;
	}

}
