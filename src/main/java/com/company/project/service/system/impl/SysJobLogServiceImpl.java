package com.company.project.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.entity.system.SysJobLogEntity;
import com.company.project.mapper.SysJobLogMapper;
import com.company.project.service.system.SysJobLogService;
import org.springframework.stereotype.Service;

/**
 * 定时任务 服务类
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
@Service("sysJobLogService")
public class SysJobLogServiceImpl extends ServiceImpl<SysJobLogMapper, SysJobLogEntity> implements SysJobLogService {


}