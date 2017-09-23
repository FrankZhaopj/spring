package com.zhaopj.spring.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.zhaopj.spring.dao.MytestMapper;
import com.zhaopj.spring.entity.Mytest;

@Controller
@RequestMapping("/test")
public class TestController {

	@Resource
	private MytestMapper mytestMapper;
	
	@RequestMapping("/show")
	public String show() {
		System.out.println("myspring is ready ...");
		return "test/test";
	}
	
	@RequestMapping("/json")
	@ResponseBody
	public Map<String, Object> json() {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("username", "zaopj");
		map.put("password", "123456");
		map.put("data", new Date());
		return map;
	}
	
	@RequestMapping("/post")
	@ResponseBody
	public Map<String, Object> post() {
		Map<String, Object> map = new HashMap<String, Object>();
		Mytest mytest = new Mytest();
		mytest.setId("3");
		mytest.setName("zhaopj");
		mytest.setAge(30);
		mytest.setBirthday(new Date());
		map.put("mytest", mytest);
		int s = mytestMapper.insert(mytest);
		return map;
	}
	
	@RequestMapping("get")
	@ResponseBody
	public Mytest ge() {
		Mytest mytest = mytestMapper.selectByPrimaryKey("2");
		return mytest;
	}
	
}
