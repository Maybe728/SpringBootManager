package com.company.project.service.system;

import com.baomidou.mybatisplus.extension.service.IService;
import com.company.project.entity.system.SysUserRole;
import com.company.project.vo.system.req.UserRoleOperationReqVO;

import java.util.List;

/**
 * 用户角色 服务类
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
public interface UserRoleService  extends IService<SysUserRole> {

    /**
     * 根据userId获取绑定的角色id
     * @param userId userId
     * @return List
     */
    List<String> getRoleIdsByUserId(String userId);

    /**
     * 用户绑定角色
     * @param vo vo
     */
    void addUserRoleInfo(UserRoleOperationReqVO vo);
}
