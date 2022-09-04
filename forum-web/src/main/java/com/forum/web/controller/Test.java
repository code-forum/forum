package com.forum.web.controller;

import com.forum.base.common.ResultEntity;
import com.forum.base.exception.BizException;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @projectName: forum
 * @package: com.forum.web.controller
 * @className: Test
 * @author: 李晓龙
 * @description: TODO
 * @date: 2022/9/4 12:33
 * @version: 1.0
 */
@RestController
@Api(value = "测试类")
public class Test {
    Test test;
    @ApiOperation(value = "测试接口正常返回")
    @GetMapping("/test1")
    public ResultEntity getTest(){
        return ResultEntity.successWithoutData("test成功");
    }
    @ApiOperation(value = "测试接口错误返回")
    @GetMapping("/test2")
    public ResultEntity getError(){
        throw new BizException("-1","用户密码错误");
    }
    @ApiOperation(value = "测试接口空指针异常错误返回")
    @GetMapping("/test3")
    public ResultEntity getError1(){
        test.getError1();
        return ResultEntity.successWithoutData();
    }
}
