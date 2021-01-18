package com.company.project.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.entity.system.SysLog;
import com.company.project.mapper.system.SysLogMapper;
import com.company.project.service.system.LogService;
import org.springframework.stereotype.Service;

/**
 * 系统日志
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
@Service
public class LogServiceImpl extends ServiceImpl<SysLogMapper, SysLog> implements LogService {
}
