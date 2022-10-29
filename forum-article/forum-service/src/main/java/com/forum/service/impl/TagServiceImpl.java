package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.TagMapper;
import com.forum.model.entity.Tag;
import com.forum.service.ITagService;
import org.springframework.stereotype.Service;

/**
 * 标签表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag> implements ITagService {

}
