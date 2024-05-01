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
	
	public List<AddressVo> selectList() {
		System.out.println("HSDao.selectList()");
		
		List<AddressVo> hsList = sqlSession.selectList("hsbook.selectList");
		
		return hsList;
	}

}
