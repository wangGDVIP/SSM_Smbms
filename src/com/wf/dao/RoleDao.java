package com.wf.dao;

import java.util.List;

import com.wf.entity.Role;

public interface RoleDao {
	
	/**
	 *查询所有角色 
	 * @return
	 */
	public List<Role> findRoles();
	
}
