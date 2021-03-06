package com.company.project.service.system;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.company.project.entity.system.SysGenerator;

/**
 * 代码生成
 *
 * @author SuperHero
 * @version V1.0
 * @date 2020年3月18日
 */
public interface ISysGeneratorService {

    /**
     * 获取所有表
     * @param page page
     * @param vo vo
     * @return IPage
     */
    IPage<SysGenerator> selectAllTables(Page<SysGenerator> page, SysGenerator vo);

    /**
     * 生成代码
     * @param tables tables
     * @return byte[]
     */
    byte[] generatorCode(String[] tables);
}
