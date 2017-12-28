package com.groupsix.freightlogisticssystem.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.freightlogisticssystem.mapper.UserMapper;
import com.groupsix.freightlogisticssystem.pojo.User;
import com.groupsix.freightlogisticssystem.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserMapper userMapper;

	@Override
	public User login(User user) {
		return user!=null?userMapper.login(user):null;
	}

	@Override
	public int isExists(User user) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int register(User user) throws Throwable {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
