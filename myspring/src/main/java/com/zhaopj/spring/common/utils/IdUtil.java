package com.zhaopj.spring.common.utils;

import java.io.Serializable;
import java.security.SecureRandom;
import java.util.UUID;

/**
 * ID工具类
 * 	1.随机生成uuid不带分隔符
 * 	2.随机生成uuid带分隔符
 * 	3.随机生成Long
 */
public class IdUtil implements Serializable {

	private static SecureRandom random = new SecureRandom();
	
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
	 */
	public static String uuid() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}
	
	/**
	 * 封装JDK自带的UUID, 通过Random数字生成, 中间有-分割.
	 */
	public static String uuidL() {
		return UUID.randomUUID().toString();
	}
	
	/**
	 * 使用SecureRandom随机生成Long. 
	 */
	public static long randomLong() {
		return Math.abs(random.nextLong());
	}

	public static void main(String[] args) {
		System.out.println(IdUtil.uuid());
		System.out.println(IdUtil.uuidL());
		
		System.out.println(IdUtil.uuid().length());
		System.out.println(IdUtil.uuidL().length());
		
		System.out.println(IdUtil.randomLong());
	}

}
