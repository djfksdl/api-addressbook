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
	
	
	//연락처 삭제1
	public int addressDelete(int aNo) {
		System.out.println("HSDao.addressDelete()");
		
		int count = sqlSession.delete("hsbook.deleteAddress", aNo);
		
		return count;
	}
	//연락처 삭제2
		public int addressDelete2(int aNo) {
			System.out.println("HSDao.addressDelete2()");
			
			int count = sqlSession.delete("hsbook.deleteAddress2", aNo);
			
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
	public List<AddressVo> selectAddress(int aNo) {
		System.out.println("HSDao.selectAddress()");
		
		List<AddressVo> dList = sqlSession.selectList("hsbook.selectOneAddress", aNo);
		
		return dList;
	}
	
	//리스트
	public List<AddressVo> selectList() {
		System.out.println("HSDao.selectList()");
		
		List<AddressVo> hsList = sqlSession.selectList("hsbook.selectList");
		
		return hsList;
	}
	
	// 수정
	public int favoriteUpdate(AddressVo addressVo) {
		System.out.println("HSDao.favoriteUpdate()");

		int count = sqlSession.update("hsbook.update", addressVo);

		return count;
	}

}
