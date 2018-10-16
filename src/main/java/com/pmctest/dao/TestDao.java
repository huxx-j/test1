package com.pmctest.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.pmctest.vo.TestVo;

@Repository
public class TestDao {
	
	@Autowired private SqlSession sqlSession; 
	
	public List<TestVo> Test() {
		List<TestVo> list = new ArrayList<>();
		list = sqlSession.selectList("test.test");
		return list;
	}
}
