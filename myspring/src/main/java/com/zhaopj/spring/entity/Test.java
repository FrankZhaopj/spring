package com.zhaopj.spring.entity;

import java.io.Serializable;
import java.util.Date;

public class Test implements Serializable {

	private String name;
	private Integer age;
	private Date birthday;
	
	public Test(String name, String pwd, Integer age, Date birthday) {
		this.name = name;
		this.age = age;
		this.birthday = birthday;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

}
