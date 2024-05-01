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
	
	public List<AddressVo> PersonGroupList() {
		System.out.println("JHDao.PersonGroupList");
		
		List<AddressVo> persongroupList = sqlSession.selectList("jhbook.selectpersongroupList");
		
		return persongroupList;
		
	}
	
	public int PersonGroupsinsert(AddressVo addressVo) {
		System.out.println("JHDao.PersonGroupsinsert");
		
		int count = sqlSession.insert("jhbook.insertpersongroup", addressVo);
		
		return count;
	}
	
}
