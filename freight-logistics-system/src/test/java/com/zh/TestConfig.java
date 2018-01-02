package com.zh;

import java.io.IOException;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.groupsix.freightlogisticssystem.common.entity.PageEntity;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath*:spring/application.xml") 
@WebAppConfiguration  
public class TestConfig {
	
}
