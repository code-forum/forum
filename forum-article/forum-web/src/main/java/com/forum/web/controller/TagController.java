package com.forum.web.controller;

import com.forum.base.result.ResultEntity;
import com.forum.model.entity.Tag;
import com.forum.model.vo.TagVo;
import com.forum.service.ITagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: 标签控制器
 * @date 2022/10/30 18:39
 */
@CrossOrigin
@RequestMapping("form/api/tag")
public class TagController {
    @Autowired
    private ITagService tagService;
    /***
     * @description 获取标签列表
     * @param: tagVo
     * @throws
     * @author 李晓龙
     * @date: 2022/10/31/ 19:43:18
     * @return: com.forum.base.result.ResultEntity<java.util.List<com.forum.model.vo.TagVo>>
     */
    public ResultEntity<List<TagVo>> getTagList(@RequestBody TagVo tagVo){
        return tagService.getList(tagVo);
    }
}
