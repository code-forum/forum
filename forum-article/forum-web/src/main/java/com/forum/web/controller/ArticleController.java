package com.forum.web.controller;

import com.forum.base.result.ResultEntity;
import com.forum.model.vo.ContentVo;
import com.forum.model.vo.PageQueryVo;
import com.forum.service.ICommentsService;
import com.forum.service.IContentService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: 文章前端控制器
 * @date 2022/10/29 21:05
 */
@Api("文章控制器")
@RestController
@RequestMapping("api/article")
public class ArticleController {
    @Autowired
    private IContentService articleService;

    /***
     * @description 分页查询文章列表
     * @param: pageQueryVo
     * @throws
     * @author 李晓龙
     * @date: 2022/10/29/ 21:17:36
     * @return: com.forum.base.result.ResultEntity<java.util.List < com.forum.model.vo.ContentVo>>
     */
    @ApiOperation(value = "分页查询文件列表")
    @RequestMapping(value = "getArticleList/{pageSize}/{pageNum}", method = RequestMethod.GET)
    public ResultEntity<Map<String, Object>> getArticleList(@RequestBody(required = false) @ApiParam(name = "contentVo", value = "条件查询对象")
                                                            ContentVo contentVo,
                                                            @PathVariable("pageSize") @ApiParam(name = "pageSize", value = "当前页面")
                                                            Integer pageSize,
                                                            @PathVariable("pageNum") @ApiParam(name = "pageNum", value = "当前页面记录数")
                                                            Integer pageNum) {

        return articleService.getArticleList(contentVo, pageSize, pageNum);
    }
}
