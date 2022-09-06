package com.forum.web.controller;

import com.forum.base.exception.BizException;
import com.forum.base.result.ResultEntity;
import com.forum.model.entity.Category;
import com.forum.service.ICategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 测试类
 *
 * @projectName: forum-web
 * @package: com.forum.web.controller
 * @className: Test
 * @author: 李晓龙
 * @description: 测试
 * @date: 2022/9/4 12:33
 * @version: 1.0
 */
@RestController
@Api(value = "测试类")
public class Test {
    @Autowired
    private ICategoryService iCategoryService;

    Test test;

    @ApiOperation(value = "测试接口正常返回")
    @GetMapping("/test1")
    public ResultEntity<String> getTest() {
        return ResultEntity.successWithoutData("test成功");
    }

    @ApiOperation(value = "测试接口错误返回")
    @GetMapping("/test2")
    public ResultEntity<String> getError() {
        throw new BizException("-1", "用户密码错误");
    }

    @ApiOperation(value = "测试接口空指针异常错误返回")
    @GetMapping("/test3")
    public ResultEntity<Void> getError1() {
        test.getError1();
        return ResultEntity.successWithoutData();
    }

    @ApiOperation(value = "获取分类信息")
    @GetMapping("getCategoryListTest")
    public ResultEntity<List<Category>> getCategoryTest() {
        List<Category> list = iCategoryService.list();
        return ResultEntity.successWithoutData(list);
    }
}
