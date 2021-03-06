package com.yuhang.www.dao;

import com.yuhang.www.entity.SysPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SysPermissionMapper {
    List<SysPermission> getPermissionsByRoleId(@Param("roleId") Integer roleId);

    List<SysPermission> getPermissionsByUserAccount(@Param("account")String account);

    Integer getRoleIdByUserAccount(@Param("account")String account);
}