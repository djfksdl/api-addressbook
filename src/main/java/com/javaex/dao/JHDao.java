package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AddressVo;

@Repository
public class JHDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	public List<AddressVo> getList2() {
		System.out.println("YSDao.getList");
		
		List<AddressVo> ysList = sqlSession.selectList("jhbook.selectList2");
		
		return ysList;
		
		
	}
}
