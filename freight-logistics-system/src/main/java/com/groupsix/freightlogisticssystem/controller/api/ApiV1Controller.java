package com.groupsix.freightlogisticssystem.controller.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.groupsix.freightlogisticssystem.service.UserService;

@RestController
@RequestMapping("/v1/")
public class ApiV1Controller {
	
	@Autowired
	UserService userService; 
	
	
	@RequestMapping(value = "/", method = RequestMethod.PUT)
	public String add() {
		
		return"";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.DELETE)
	public String del() {
		return"";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.POST)
	public String modify() {
		return"";
	}
	
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String get() {
		return"";
	}
	
	
}
