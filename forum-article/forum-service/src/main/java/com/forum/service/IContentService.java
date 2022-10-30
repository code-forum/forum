package com.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forum.base.result.ResultEntity;
import com.forum.model.entity.Content;
import com.forum.model.vo.ContentVo;
import com.forum.model.vo.PageQueryVo;

import java.util.Map;

/**
 * <p>
 * 文章表 服务类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
public interface IContentService extends IService<Content> {
    /**
     * @throws
     * @description getArticleList 获取文章列表
     * @param: pageQueryVo
     * @author 李晓龙
     * @date: 2022/10/29/ 21:38:35
     * @return: com.forum.base.result.ResultEntity<java.util.Map < java.lang.String, java.lang.Object>>
     */
    ResultEntity<Map<String, Object>> getArticleList(ContentVo contentVo, Integer pageSize, Integer pageNum);
}
