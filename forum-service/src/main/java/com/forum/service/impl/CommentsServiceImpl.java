package com.forum.service.impl;

import com.forum.mbg.forum.entity.Comments;
import com.forum.mbg.forum.mapper.CommentsMapper;
import com.forum.mbg.forum.service.ICommentsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 评论表 服务实现类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CommentsServiceImpl extends ServiceImpl<CommentsMapper, Comments> implements ICommentsService {

}
