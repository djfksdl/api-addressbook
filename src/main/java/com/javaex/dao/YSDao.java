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
	
	public List<AddressVo> getList() {
		System.out.println("YSDao.getList");
		
		List<AddressVo> ysList = sqlSession.selectList("ysbook.selectList");
		
		return ysList;
		
		
	}
}
