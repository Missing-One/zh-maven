package com.groupsix.freightlogisticssystem.mapper;

import com.groupsix.freightlogisticssystem.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String phone);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String phone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}