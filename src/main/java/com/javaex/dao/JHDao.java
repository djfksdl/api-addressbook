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
	
	public int PersonAddresswrite(AddressVo addressVo) {
		System.out.println("JHDao.PersonAddresswrite");
		
		int count = sqlSession.insert("jhbook.insertpersonaddress", addressVo);
		
		return count;
	}
	
	public AddressVo WriteAddressNoSelect(int no) {
		System.out.println("JHDao.WriteAddressNoSelect");
		
		
		AddressVo addVo = sqlSession.selectOne("jhbook.SelectWriteAddressNo", no);
		
		return addVo;
	}
	
	public void PersonGroupAllList(AddressVo addressVo) {
		System.out.println("JHDao.PersonGroupAllList");
		
		sqlSession.insert("jhbook.addressgroupinsert", addressVo);
	}
	
	
	
}
