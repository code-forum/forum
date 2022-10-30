package com.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forum.base.result.ResultEntity;
import com.forum.model.entity.Category;
import com.forum.model.vo.CategoryTreeVo;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
public interface ICategoryService extends IService<Category> {
    /***
     * @description 获取目录树
     * @param:
     * @throws
     * @author 李晓龙
     * @date: 2022/10/30/ 16:56:34
     * @return: com.forum.base.result.ResultEntity<java.util.List<com.forum.model.entity.Category>>
     */
    ResultEntity<List<CategoryTreeVo>> getCategoryList();
}
