package com.zhaopj.spring.web;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/test")
public class TestController {

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
	
}
