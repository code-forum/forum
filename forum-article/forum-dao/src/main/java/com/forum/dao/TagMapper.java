package com.forum.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.forum.model.entity.Tag;

import java.util.List;

/**
 * <p>
 * 标签表 Mapper 接口
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
public interface TagMapper extends BaseMapper<Tag> {
    /***
     * @description 根据文章id查询标签列表
     * @param: id
     * @throws
     * @author 李晓龙
     * @date: 2022/10/30/ 15:49:46
     * @return: java.util.List<com.forum.model.entity.Tag>
     */
    List<Tag> selectTagByContentId(Long id);
}
