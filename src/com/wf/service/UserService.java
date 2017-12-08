package com.wf.service;

import java.util.List;

import com.wf.entity.User;

public interface UserService {
		
public int addUser(User user);
	
	public int updateUser(User user);
	
	public int deleteUser(Integer id);
	/**
	 * 登陆
	 * @param user
	 * @return
	 */
	public User findUser(User user);
	/**
	 * 模糊查询   	分页
	 * @param queryname 用户名
	 * @param queryUserRole	角色
	 * @param pageIndex	当前页
	 * @param pageSize	个数
	 * @return
	 */
	public List<User> getUserList(String queryname,Integer queryUserRole,
						Integer pageIndex,Integer pageSize);
	
	public Integer getUserCount(String queryname,Integer queryUserRole);
	
	
}
