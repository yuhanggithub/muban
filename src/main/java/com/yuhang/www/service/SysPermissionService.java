package com.yuhang.www.service;

import com.yuhang.www.entity.SysPermission;

import java.util.List;

public interface SysPermissionService {
	public List<SysPermission> getPermissionsByRoleId(Integer roleId);

	public List<SysPermission> getPermissionsByUserAccount(String account);

	public Integer getRoleByUserAccount(String account);
}
