package com.pmctest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pmctest.dao.TestDao;
import com.pmctest.vo.TestVo;

@Service
public class TestService {

	@Autowired private TestDao testDao;
	
	public List<TestVo> Test() {
		return testDao.Test();
	}
	
}
