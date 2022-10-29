package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.ContentMapper;
import com.forum.model.entity.Content;
import com.forum.service.IContentService;
import org.springframework.stereotype.Service;

/**
 * 文章表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {

}
