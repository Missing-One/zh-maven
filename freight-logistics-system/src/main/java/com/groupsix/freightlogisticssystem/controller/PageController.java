package com.groupsix.freightlogisticssystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.groupsix.freightlogisticssystem.pojo.User;
import com.groupsix.freightlogisticssystem.service.UserService;


@Controller
public class PageController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	@RequestMapping("/{page}")
	public String index(@PathVariable String page){
		return page;
	}
	
	/**
	 * 
	 * @param user
	 * @param model
	 * @return
	 */
	@RequestMapping("dologin")
	public String tologin(User user,Model model){
		user=userService.login(user);
		
		if(user != null) {
			model.addAttribute("user", user);
			return "/index"; 
		} else {
			return "/login";
		}
		
	}
	
	
}
