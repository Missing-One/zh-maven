package com.groupsix.freightlogisticssystem.service;

import com.groupsix.freightlogisticssystem.pojo.User;

public interface UserService {
    int deleteByPrimaryKey(String phone);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String phone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}