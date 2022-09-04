package com.forum.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.dao.CollectMapper;
import com.forum.model.entity.Collect;
import com.forum.service.ICollectService;
import org.springframework.stereotype.Service;

/**
 * 收集服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class CollectServiceImpl extends ServiceImpl<CollectMapper, Collect> implements ICollectService {

}
