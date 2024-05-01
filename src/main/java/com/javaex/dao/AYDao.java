package com.javaex.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.javaex.vo.AddressVo;

@Repository
public class AYDao {

	@Autowired SqlSession sqlSession;
	
	//전체리스트
		public List<AddressVo> selectList(){
			System.out.println("AYDao.selectList");
			
			List<AddressVo> addressList = sqlSession.selectList("aybook.selectList");
			
			return addressList;
		}
}
