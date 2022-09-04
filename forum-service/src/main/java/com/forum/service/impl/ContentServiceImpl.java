package com.forum.service.impl;

import com.forum.mbg.forum.entity.Content;
import com.forum.mbg.forum.mapper.ContentMapper;
import com.forum.mbg.forum.service.IContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 文章表 服务实现类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
