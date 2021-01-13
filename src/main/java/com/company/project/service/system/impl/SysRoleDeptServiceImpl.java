package com.company.project.service.system.impl;

import org.springframework.stereotype.Service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import com.company.project.mapper.SysRoleDeptMapper;
import com.company.project.entity.system.SysRoleDeptEntity;
import com.company.project.service.system.SysRoleDeptService;


@Service("sysRoleDeptService")
public class SysRoleDeptServiceImpl extends ServiceImpl<SysRoleDeptMapper, SysRoleDeptEntity> implements SysRoleDeptService {


}