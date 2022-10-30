package com.forum.web.controller;

import com.forum.base.result.ResultEntity;
import com.forum.model.entity.Category;
import com.forum.model.vo.CategoryTreeVo;
import com.forum.service.ICategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;



@Api("分类目录控制器")
@RestController
@RequestMapping("form/api/category")
public class CategoryController {

    private final ICategoryService categoryService;

    @Autowired
    public CategoryController(ICategoryService categoryService) {
        this.categoryService = categoryService;
    }


  /**
   * @description:
   * @param: null
   * @return:
   * @return null
   * @author 李晓龙
   * @date: 2022/10/21 21:00
   */
    @ApiOperation("获取分类列表")
    @GetMapping("getCategoryList")
    public ResultEntity<List<CategoryTreeVo>> getCategoryList(){
        return categoryService.getCategoryList();
    }

}
