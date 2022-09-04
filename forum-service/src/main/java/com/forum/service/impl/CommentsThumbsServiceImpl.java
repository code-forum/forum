package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.CommentsThumbsMapper;
import com.forum.model.entity.CommentsThumbs;
import com.forum.service.ICommentsThumbsService;
import org.springframework.stereotype.Service;

/**
 * 评论点赞表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CommentsThumbsServiceImpl extends ServiceImpl<CommentsThumbsMapper, CommentsThumbs>
        implements ICommentsThumbsService {
    
}
