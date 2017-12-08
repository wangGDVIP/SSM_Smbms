package com.wf.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.dao.RoleDao;
import com.wf.entity.Role;
import com.wf.service.RoleService;

@Service("roleService")
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleDao roleDao;
	public RoleDao getRoleDao() {
		return roleDao;
	}
	public void setRoleDao(RoleDao roleDao) {
		this.roleDao = roleDao;
	}


	@Override
	public List<Role> findRoles() {
		return roleDao.findRoles();
	}

}
