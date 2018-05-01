package com.zh.tmall.admin.web.config;

import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;

import com.alibaba.druid.support.http.StatViewServlet;

/**
 * 配置德鲁伊监控系统<br>
 * 使用以下链接访问监控系统
 * <p>http://localhost:端口/项目名/druid/ 
 * <p>http://localhost:端口/项目名/druid/index.html
 * 
 * @author zh
 */
@WebServlet(
		urlPatterns = {"/druid/*"},
		initParams = {
				@WebInitParam(name ="allow", value = "127.0.0.1"),
//				@WebInitParam(name = "loginUsername", value="zh"),
//				@WebInitParam(name = "loginPassword", value="123"),
				@WebInitParam(name = "resetEnable", value="false")
		}
)
public class DruidServletMonitor extends StatViewServlet{

	private static final long serialVersionUID = 1L;
	
	// 代替
	/*<servlet>
		<servlet-name>druidStatView</servlet-name>
		<servlet-class>com.alibaba.druid.support.http.StatViewServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>druidStatView</servlet-name>
		<url-pattern>/druid</url-pattern>
	</servlet-mapping>*/
}
