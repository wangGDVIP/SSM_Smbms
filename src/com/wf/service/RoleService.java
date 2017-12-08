package com.wf.service;

import java.util.List;

import com.wf.entity.Role;


public interface RoleService {
	/**
	 *查询所有角色 
	 * @return
	 */
	public List<Role> findRoles();
}
