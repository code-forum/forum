package com.forum.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.forum.base.result.ResultEntity;
import com.forum.model.entity.Tag;
import com.forum.model.vo.TagVo;

import java.util.List;

/**
 * <p>
 * 标签表 服务类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
public interface ITagService extends IService<Tag> {
    /*** 
     * @description 获取标签列表
     * @param: tagVo 
     * @throws 
     * @author 李晓龙
     * @date: 2022/10/31/ 19:43:34
     * @return: com.forum.base.result.ResultEntity<java.util.List<com.forum.model.vo.TagVo>>
     */
    ResultEntity<List<TagVo>> getList(TagVo tagVo);
}
