package com.forum.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.base.result.ResultEntity;
import com.forum.dao.TagMapper;
import com.forum.model.entity.Tag;
import com.forum.model.vo.TagVo;
import com.forum.service.ITagService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 标签表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

    @Override
    public ResultEntity<List<TagVo>> getList(TagVo queryTagVo) {
        QueryWrapper<Tag> tagQueryWrapper = new QueryWrapper<>();
        if (ObjectUtils.isEmpty(queryTagVo.getTagName())) {
            tagQueryWrapper.eq("tag_name", queryTagVo.getTagName());
        }
        List<TagVo> tagVoList = this.list(tagQueryWrapper).stream().map(tag -> {
            TagVo tagVo = new TagVo();
            BeanUtils.copyProperties(tag, tagVo);
            return tagVo;
        }).collect(Collectors.toList());
        return ResultEntity.successWithoutData(tagVoList);
    }
}
