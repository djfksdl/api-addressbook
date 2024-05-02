package com.javaex.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AddressVo;

@Repository
public class DSDao {
	
	@Autowired
	private SqlSession sqlSession;
	
	//수정폼 - 1개 데이터 가져오기
	public AddressVo selectOneGroup(int cNo) {
		System.out.println("DSDao.selectOneGroup()");

//		System.out.println("---------다오 앞--------"+cNo);
		
		AddressVo aVo=sqlSession.selectOne("dsbook.selectOneGroup", cNo);
		
//		System.out.println("---------다오 뒤--------"+aVo);
		
		return aVo;
	}
	
	//수정
	public int updateGroupName(AddressVo aVo) {
		System.out.println("DSDao.groupNameUpdate()");
		
		int count=sqlSession.update("dsbook.update", aVo);
		
//		System.out.println("dao= "+count);
		
		return count;
	}

}
