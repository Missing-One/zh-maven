package com.groupsix.freightlogisticssystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupsix.freightlogisticssystem.pojo.User;
import com.groupsix.freightlogisticssystem.service.UserService;

@Controller
public class PageController {
	@Autowired
	private UserService userService;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String index(@PathVariable String page){
		return page;
	}
	
	@RequestMapping("chkRegister")
	public String register(User user) throws Throwable{
		if (user!=null) {
			if (userService.isExists(user)>0) {
				return "register";
			} else {
				return userService.register(user)>0?"login":"register";
			}		
		} else {
			return "register";
		}
	}
}
