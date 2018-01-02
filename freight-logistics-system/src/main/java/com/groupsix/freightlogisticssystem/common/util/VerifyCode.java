package com.groupsix.freightlogisticssystem.common.util;

import java.util.Random;

/**
 * 验证码类
 * @author mk
 *
 */
public class VerifyCode {
	
	//初始化验证字符串
	private final static String str = "123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	//验证码的宽度
	private int width;
	
	//验证码的高度
	private int height;
	
	//验证是否成功 true 成功
	private int isSuccess;
	
	//验证内容
	private String code;
	
	
	public static String getVeriCode(){
		Random r = new Random();
		StringBuilder result = new StringBuilder();
		
		for (int i = 1; i <= 4; i++) {
			result.append(str.charAt( r.nextInt ( str.length() ) ) );
			//result.append(" ");
		}
		return result.toString();
		
	}
	
	public static void main(String[] args) {
		System.out.println(111);
	}
}
