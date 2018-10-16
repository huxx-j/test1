package com.pmctest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.pmctest.service.TestService;
import com.pmctest.vo.TestVo;

@Controller
public class TestController {
	
	@Autowired private TestService testService;

	@RequestMapping(value = "/")
	public String Test(Model model) {
		System.out.println("in");
		List<TestVo> list = testService.Test();
		for (TestVo vo : list) {
			System.out.println("이름 : " + vo.getName() + " // 핸드폰 번호 : " + vo.getPhone());
		}
		
		model.addAttribute("list", list);
		
		return "index";
	}
}
