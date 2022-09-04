package com.forum.service.impl;

import com.forum.mbg.forum.entity.Tag;
import com.forum.mbg.forum.mapper.TagMapper;
import com.forum.mbg.forum.service.ITagService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 标签表 服务实现类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
