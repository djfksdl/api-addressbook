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
	
	
	//연락처 삭제
	public int addressDelete(int aNo) {
		System.out.println("HSDao.addressDelete()");
		
		int count = sqlSession.delete("hsbook.deleteAddress", aNo);
		
		return count;
	}
	
//	//그룹 불러오기
//	public List<AddressVo> selectGroup(int aNo) {
//		System.out.println("HSDao.selectGroup()");
//		
//		List<AddressVo> gList = sqlSession.selectList("hsbook.selectGroup", aNo);
//		
//		return gList;
//	}
	
	//상세정보 불러오기
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
