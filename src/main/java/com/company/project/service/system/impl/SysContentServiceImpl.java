package com.company.project.service.system.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.company.project.entity.system.SysContentEntity;
import com.company.project.mapper.system.SysContentMapper;
import com.company.project.service.system.SysContentService;
import org.springframework.stereotype.Service;

/**
 * 内容 服务类
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
@Service("sysContentService")
public class SysContentServiceImpl extends ServiceImpl<SysContentMapper, SysContentEntity> implements SysContentService {


}