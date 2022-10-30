package com.forum.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forum.model.entity.Content;
import com.forum.model.vo.ContentVo;

import java.util.List;

/**
 * <p>
 * 文章表 Mapper 接口
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
public interface ContentMapper extends BaseMapper<Content> {
    /***
     * @description 查询文章列表
     * @param: t
     * @throws
     * @author 李晓龙
     * @date: 2022/10/29/ 22:09:08
     * @return: java.util.List<com.forum.model.vo.ContentVo>
     */
    List<ContentVo> getArticleList(ContentVo t);
}
