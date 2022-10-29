package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.CategoryMapper;
import com.forum.model.entity.Category;
import com.forum.service.ICategoryService;
import org.springframework.stereotype.Service;

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

}
