package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.CollectContentMapper;
import com.forum.model.entity.CollectContent;
import com.forum.service.ICollectContentService;
import org.springframework.stereotype.Service;

/**
 * 用户收藏夹与文章关联表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CollectContentServiceImpl extends ServiceImpl<CollectContentMapper, CollectContent>
        implements ICollectContentService {
    
}
