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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int register(User user) throws Throwable {
		if (user!=null) {
			if (isExists(user)==1) {
				return 0;
			} else if (isExists(user)==0){
				return userMapper.insert(user);
			}else {
				return -1;
			}
		}else {
			return -1;
		}
		
	}

	@Override
	public int isExists(User user) {
		
		return userMapper.selectByPrimaryKey(user.getPhone()) == null
				? 0	 //用户不存在
				: 1; //用户已存在
	}
	
}
