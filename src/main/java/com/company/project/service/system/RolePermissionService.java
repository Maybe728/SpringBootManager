package com.company.project.service.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.entity.system.SysRolePermission;
import com.company.project.vo.system.req.RolePermissionOperationReqVO;

/**
 * 角色权限关联
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
public interface RolePermissionService extends IService<SysRolePermission> {

    /**
     * 角色绑定权限
     * @param vo vo
     */
    void addRolePermission(RolePermissionOperationReqVO vo);
}
