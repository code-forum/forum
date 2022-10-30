package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.base.result.ResultEntity;
import com.forum.base.uitls.BuildTree;
import com.forum.dao.CategoryMapper;
import com.forum.model.entity.Category;
import com.forum.model.vo.CategoryTreeVo;
import com.forum.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 分类服务实现类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {
    @Autowired
    private CategoryMapper categoryMapper;

    @Override
    public ResultEntity<List<CategoryTreeVo>> getCategoryList() {
        //查询出全部列表 通过工具类进行树构造
        return ResultEntity.successWithoutData( BuildTree.getBuildTree(categoryMapper.selectList(null)));
    }
}
