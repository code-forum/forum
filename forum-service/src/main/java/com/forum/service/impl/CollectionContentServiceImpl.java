package com.forum.service.impl;

import com.forum.mbg.forum.entity.CollectionContent;
import com.forum.mbg.forum.mapper.CollectionContentMapper;
import com.forum.mbg.forum.service.ICollectionContentService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户收藏夹与文章关联表 服务实现类
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CollectionContentServiceImpl extends ServiceImpl<CollectionContentMapper, CollectionContent> implements ICollectionContentService {

}
