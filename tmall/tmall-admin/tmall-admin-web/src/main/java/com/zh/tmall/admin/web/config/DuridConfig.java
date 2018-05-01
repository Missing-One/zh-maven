package com.zh.tmall.admin.web.config;


import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import com.zh.tmall.admin.web.ApplicationStart;
import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.EnvironmentAware;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;


@Configuration
@MapperScan("com.zh.tmall.mapper")
public class DuridConfig{
	private final static Logger LOG = Logger.getLogger(ApplicationStart.class);
	@Autowired
    private Environment env;
	
	@Bean(initMethod="init",destroyMethod="close")
	DataSource dataSource() {
		DruidDataSource datasource = new DruidDataSource(); 
		datasource.setDriverClassName(env.getProperty("druid.datasource.driverClass"));
		datasource.setUrl(env.getRequiredProperty("druid.datasource.jdbcUrl"));
		datasource.setUsername(env.getRequiredProperty("druid.datasource.username"));
		datasource.setPassword(env.getRequiredProperty("druid.datasource.password"));
		
		datasource.setInitialSize(env.getProperty("druid.datasource.initialSize", Integer.class));
		//datasource.setMaxActive(env.getProperty("druid.datasource.maxActive", Integer.class));
		datasource.setMinIdle(env.getProperty("druid.datasource.minIdle", Integer.class));
		datasource.setMaxWait(env.getProperty("druid.datasource.maxWaitMillis", Integer.class));
		datasource.setUseUnfairLock(env.getProperty("druid.datasource.useUnfairLock", Boolean.class));
		datasource.setTimeBetweenEvictionRunsMillis(env.getProperty("druid.datasource.timeBetweenEvictionRunsMillis", Long.class));
		datasource.setMinEvictableIdleTimeMillis(env.getProperty("druid.datasource.minEvictableIdleTimeMillis", Long.class));
		datasource.setTestWhileIdle(env.getProperty("druid.datasource.testWhileIdle", Boolean.class));
		datasource.setValidationQuery(env.getProperty("druid.datasource.validationQuery"));
		try {
			datasource.setFilters(env.getProperty("druid.datasource.filters"));
		} catch (SQLException e) {
			LOG.error("druid configuration initialization filter:" + e);
		}
		return datasource;
	}

	@Bean
	ServletRegistrationBean druidServlet(){
		ServletRegistrationBean servletRegistrationBean = new ServletRegistrationBean();
		servletRegistrationBean.setServlet(new StatViewServlet());
		servletRegistrationBean.addUrlMappings("/druid/*");
		Map<String, String> initParameters = new HashMap<String, String>();
		// initParameters.put("loginUsername", "druid");	// 用户名
		// initParameters.put("loginPassword", "druid");	// 密码
		initParameters.put("resetEnable", "false");		// 禁用HTML页面上的“Reset All”功能
		initParameters.put("allow", "127.0.0.1"); 		// IP白名单 (没有配置或者为空，则允许所有访问)
		// initParameters.put("deny", "192.168.20.38");		// IP黑名单,deny优先于allow
		servletRegistrationBean.setInitParameters(initParameters);
		return servletRegistrationBean;
	}


	@Bean
	FilterRegistrationBean filterRegistrationBean() {
		FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean();
		filterRegistrationBean.setFilter(new WebStatFilter());
		filterRegistrationBean.addUrlPatterns("/*");
		filterRegistrationBean.addInitParameter("exclusions", "*.js,*.gif,*.jpg,*.png,*.css,*.ico,/druid/*");
		return filterRegistrationBean;
	}








	/*@Bean
    public SqlSessionFactoryBean sqlSessionFactoryBean() throws IOException{
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();  
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(env.getProperty("mybayis.mybatisConfig")));
        sqlSessionFactoryBean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("mybayis.mapperLocations")));
        sqlSessionFactoryBean.setTypeAliasesPackage(env.getProperty("mybayis.typeAliasesPackage"));//别名，让*Mpper.xml实体类映射可以不加上具体包名
        return sqlSessionFactoryBean;
    }
	
	@Bean(name = "transactionManager")
    public DataSourceTransactionManager dataSourceTransactionManager(){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource());
        return dataSourceTransactionManager;
    }*/


}
