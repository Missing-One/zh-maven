package com.zh.tmall.admin.web.config.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.springframework.web.filter.CharacterEncodingFilter;

/**
 * 配置spring编码过滤器
 * 
 * @author zh
 */
//@WebFilter( urlPatterns = {"/*"},
//			initParams = {@WebInitParam(name = "encoding", value="UTF-8")
//			}
//)
public class SpringCharacterEncodingFilter extends CharacterEncodingFilter{
	// 代替
	/*<filter>  
	<filter-name>CharacterEncodingFilter</filter-name>  
	<filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>  
	    <init-param>  
	        <param-name>encoding</param-name>  
	        <param-value>utf-8</param-value>  
	    </init-param>  
	</filter>  
	<filter-mapping>  
	    <filter-name>CharacterEncodingFilter</filter-name>  
	    <url-pattern></url-pattern>  
	</filter-mapping>*/

}
