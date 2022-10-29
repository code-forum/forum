package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.CommentsMapper;
import com.forum.model.entity.Comments;
import com.forum.service.ICommentsService;
import org.springframework.stereotype.Service;

/**
 * 评论表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
