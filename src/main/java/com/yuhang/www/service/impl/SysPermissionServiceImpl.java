package com.yuhang.www.service.impl;

import com.yuhang.www.dao.SysPermissionMapper;
import com.yuhang.www.entity.SysPermission;
import com.yuhang.www.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Copyright(C) 2018-2018
 * Author: wanhaoran
 * Date: 2018/6/5 14:52
 */
@Service("sysPermissionService")
@Transactional(value = "transactionManager")
public class SysPermissionServiceImpl implements SysPermissionService {
	@Autowired
	private SysPermissionMapper sysPermissionMapper;

	@Override
	public List<SysPermission> getPermissionsByRoleId(Integer roleId) {
		List<SysPermission> sysPermissions = sysPermissionMapper.getPermissionsByRoleId(roleId);
		return sysPermissions;
	}

	@Override
	public List<SysPermission> getPermissionsByUserAccount(String account) {
		List<SysPermission> sysPermissions = sysPermissionMapper.getPermissionsByUserAccount(account);
		return  sysPermissions;
	}

	@Override
	public Integer getRoleByUserAccount(String account) {
		return sysPermissionMapper.getRoleIdByUserAccount(account);
	}
}
