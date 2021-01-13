package com.company.project.controller.order;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.metadata.IPage;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import java.util.List;
import com.company.project.common.utils.DataResult;

import com.company.project.entity.order.OrderInfoEntity;
import com.company.project.service.order.OrderInfoService;



/**
 * 
 *
 * @author SuperHero
 * @date 2021-01-13 19:03:34
 */
@Controller
@RequestMapping("/")
public class OrderInfoController {
    @Autowired
    private OrderInfoService orderInfoService;


    /**
    * 跳转到页面
    */
    @GetMapping("/index/orderInfo")
    public String orderInfo() {
        return "orderinfo/list";
        }

    @ApiOperation(value = "新增")
    @PostMapping("orderInfo/add")
    @RequiresPermissions("orderInfo:add")
    @ResponseBody
    public DataResult add(@RequestBody OrderInfoEntity orderInfo){
        orderInfoService.save(orderInfo);
        return DataResult.success();
    }

    @ApiOperation(value = "删除")
    @DeleteMapping("orderInfo/delete")
    @RequiresPermissions("orderInfo:delete")
    @ResponseBody
    public DataResult delete(@RequestBody @ApiParam(value = "id集合") List<String> ids){
        orderInfoService.removeByIds(ids);
        return DataResult.success();
    }

    @ApiOperation(value = "更新")
    @PutMapping("orderInfo/update")
    @RequiresPermissions("orderInfo:update")
    @ResponseBody
    public DataResult update(@RequestBody OrderInfoEntity orderInfo){
        orderInfoService.updateById(orderInfo);
        return DataResult.success();
    }

    @ApiOperation(value = "查询分页数据")
    @PostMapping("orderInfo/listByPage")
    @RequiresPermissions("orderInfo:list")
    @ResponseBody
    public DataResult findListByPage(@RequestBody OrderInfoEntity orderInfo){
        Page page = new Page(orderInfo.getPage(), orderInfo.getLimit());
        LambdaQueryWrapper<OrderInfoEntity> queryWrapper = Wrappers.lambdaQuery();
        //查询条件示例
        //queryWrapper.eq(OrderInfoEntity::getId, orderInfo.getId());
        IPage<OrderInfoEntity> iPage = orderInfoService.page(page, queryWrapper);
        return DataResult.success(iPage);
    }

}
