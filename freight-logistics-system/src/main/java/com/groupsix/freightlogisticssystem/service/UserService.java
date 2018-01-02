package com.groupsix.freightlogisticssystem.service;

import com.groupsix.freightlogisticssystem.pojo.User;

/**
 * 用户业务接口
 * 
 * <p>这里查看需要的实体类
 * 用户:{@link com.groupsix.freightlogisticssystem.pojo.User User}
 * 
 * @author zh
 */
public interface UserService {
	
	/**
	 * 查询用户是否存在
	 * 需要手机号{@link User.phone}是否已经被注册过
	 * 
	 * @return 返回状态码{@code -1查询失败  0不存在该用户  1已存在该用户}
	 */
	int isExists(User user);
	
	/**
	 * 用户登陆
	 * 需要登陆所需的账号密码
	 * 
	 * 	<li>账号,手机号{@link User#getPhone()}
	 *  <li>密码 {@link User#getPassword()}
	 *  
	 * @return 如果登陆成功,返回当前用户登陆的所有信息;如果登陆失败,返回 {@code null}
	 */
	User login(User user);
	
	/**
	 * 用户注册
	 * 需要开启事务
	 * 	需要用户的信息
	 * <ul>
	 * <li> 手机号{@link User#getPhone()}
	 * <li> 密码{@link User#getPassword()}
	 * <li> 真是姓名{@link User#getUserName()}
	 * <li> 身份证{@link User#getIdCard()}
	 * <li> 电子邮箱{@link User#getEmail()}
	 * <li> 所在地址{@link User#getAddress()}
	 * </ul>
	 * 
	 * @param user 用户各个属性的封装实体
	 * @return 返回状态码{@code -1注册异常,事务回滚 0注册失败 1注册成功}
	 * 
	 * @throws Throwable 当无法连接数据库,执行插入语句时抛出异常
	 */
	int register(User user) throws Throwable;
	
	
//	int releaseCommodity() throws Throwable;
	
}
