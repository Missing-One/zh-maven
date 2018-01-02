package com.groupsix.freightlogisticssystem.common.entity;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.databind.JsonNode;

/**
 * 响应
 * 
 * @author zh
 */
public class ResponseEntity implements Serializable{
	
	private static final long serialVersionUID = 6865144948647121959L;

	private  String state;	// 响应状态码
	
	private String msg;		// 响应消息
	
	private Object data; 	// 响应数据
	
	public ResponseEntity() {
		super();
	}
	
	public ResponseEntity(Object data) {
		this("ok","success",data);
	}
	
	public ResponseEntity(String state, String msg, Object data) {
		super();
		this.state = state;
		this.msg = msg;
		this.data = data;
	}


	/**
	 * 构建一个响应的对象
	 * 信息自定义，携带数据
	 * 
	 * @param state 状态
	 * @param msg 	消息
	 * @param data	 数据
	 * @return		 自定义响应对象
	 */
	public static ResponseEntity build(String state, String msg, Object data) {
		return new ResponseEntity(state, msg, data);
	}
	/**
	 * 构建一个响应的对象
	 * 信息自定义,不带数据
	 * 
	 * @param state  状态
	 * @param msg 消息
	 * @return 自定义响应
	 * @see #build(String,String,Object)
	 */
	public static ResponseEntity build(String state, String msg) {
		return build(state, msg, null);
	}
	/**
	 * 处理成功，携带数据的响应
	 * 
	 * @param data  数据
	 * @return 携带数据的响应对象 
	 * <p>状态和消息默认:
	 * @see #state 状态{@value 200} 
	 * @see #msg 消息{@value "success"}
	 * @see #build(String, String, Object)
	 */
	public static ResponseEntity success(Object data) {
		return build("ok", "success", data);
	}
	
	/**
	 * 处理成功，不带数据的响应
	 * 
	 * @return 不带数据的响应对象 
	 * @see #success(Object)
	 */
	public static ResponseEntity success() {
		return success(null);
	}

}  
    
    