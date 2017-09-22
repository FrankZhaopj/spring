package com.zhaopj.spring.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping("/show")
	public String show() {
		System.out.println("myspring is ready ...");
		return "test/test";
	}
	
}
