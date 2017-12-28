package com.groupsix.freightlogisticssystem.mapper;

import com.groupsix.freightlogisticssystem.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String phone);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String phone);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
    
    
    /**
	 * 用户登陆
	 * 需要登陆所需的账号密码
	 * 
	 * 	<li>账号,手机号{@link User.phone}
	 *  <li>密码 {@link User.password}
	 *  
	 * @return 如果登陆成功,返回当前用户登陆的所有信息;如果登陆失败,返回 {@link null}
	 */
	User login(User user);
    
}