package com.zh.tmall.admin.web.config.filter;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import com.alibaba.druid.support.http.WebStatFilter;

/**
 * 配置德鲁伊静态资源过滤
 * exclusions 排除一些不必要的资源
 * 
 * @author zh
 */
@WebFilter(
		urlPatterns = {"/*"},
			initParams={@WebInitParam(name="exclusions", value="*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*")}
		)
public class DruidStatFilter extends WebStatFilter{
	/*<filter>  
	  <filter-name>DruidStatFilter</filter-name>  
	  <filter-class>com.alibaba.druid.support.http.WebStatFilter</filter-class>  
	  <init-param>  
	      <param-name>exclusions</param-name>  
	      <param-value>*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid</param-value>  
	  </init-param>  
	</filter>  
	<filter-mapping>  
	  <filter-name>DruidStatFilter</filter-name>  
	  <url-pattern>/*</url-pattern>  
	</filter-mapping>*/
}
