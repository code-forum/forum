package com.forum.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.forum.base.result.ResultEntity;
import com.forum.dao.CommentsThumbsMapper;
import com.forum.dao.ContentMapper;
import com.forum.dao.TagMapper;
import com.forum.dao.ThumbsUpMapper;
import com.forum.model.entity.CommentsThumbs;
import com.forum.model.entity.Content;
import com.forum.model.entity.Tag;
import com.forum.model.entity.ThumbsUp;
import com.forum.model.vo.ContentVo;
import com.forum.model.vo.PageQueryVo;
import com.forum.service.IContentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ObjectUtils;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 文章表 服务实现类
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Service
public class ContentServiceImpl extends ServiceImpl<ContentMapper, Content> implements IContentService {
    @Autowired
    private ContentMapper contentMapper;
    @Autowired
    private ThumbsUpMapper thumbsUpMapper;
    @Autowired
    private CommentsThumbsMapper commentsThumbsMapper;
    @Autowired
    private TagMapper tagMapper;

    @Override
    public ResultEntity<Map<String, Object>> getArticleList(ContentVo pageQueryVo, Integer pageSize, Integer pageNum) {
        Map<String, Object> map = new HashMap<>(3);
        //查询数据库得到分页的数据并返回
        PageHelper.startPage(pageNum, pageSize);
        List<ContentVo> contentVoList = contentMapper.getArticleList(pageQueryVo);
        contentVoList.forEach(contentVo -> {
            //  点赞数
            //通过文章id查询
            contentVo.setThunksUpNumbs(Math.toIntExact(thumbsUpMapper.selectCount(new QueryWrapper<ThumbsUp>().eq("comments_id", contentVo.getId()))));
            //  评论数还没查询
            contentVo.setComments(Math.toIntExact(commentsThumbsMapper.selectCount(new QueryWrapper<CommentsThumbs>().eq("comments_id", contentVo.getId()))));
            contentVo.setTagName(tagMapper.selectTagByContentId(contentVo.getId()));
        });
        PageInfo<ContentVo> pageInfo = new PageInfo<>(contentVoList);
        map.put("total", pageInfo.getTotal());
        map.put("contentVoList", pageInfo.getList());
        return ResultEntity.successWithoutData(map);
    }
}
