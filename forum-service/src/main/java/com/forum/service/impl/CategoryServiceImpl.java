package com.forum.service.impl;

import com.forum.mbg.forum.entity.Category;
import com.forum.mbg.forum.mapper.CategoryMapper;
import com.forum.mbg.forum.service.ICategoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements ICategoryService {

}
