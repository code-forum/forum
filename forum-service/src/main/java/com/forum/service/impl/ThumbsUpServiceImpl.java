package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.ThumbsUpMapper;
import com.forum.model.entity.ThumbsUp;
import com.forum.service.IThumbsUpService;
import org.springframework.stereotype.Service;

/**
 * 点赞表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class ThumbsUpServiceImpl extends ServiceImpl<ThumbsUpMapper, ThumbsUp> implements IThumbsUpService {

}
