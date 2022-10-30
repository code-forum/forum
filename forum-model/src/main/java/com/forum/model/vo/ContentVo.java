package com.forum.model.vo;

import com.forum.model.entity.BaseEntity;
import com.forum.model.entity.Category;
import com.forum.model.entity.Tag;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: 文章Vo对象拥有前端页面数据展示
 * @date 2022/10/29 20:57
 */
@Data
@ApiModel(value = "ContentVo", description = "文章数据表")
public class ContentVo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章名称")
    private String contentName;

    @ApiModelProperty("文章内容")
    private String articleContent;

    @ApiModelProperty("分类Id")
    private String categoryId;

    @ApiModelProperty("分类列表")
    private String  categoryName;



    @ApiModelProperty("点赞数量")
    private Integer thunksUpNumbs;


    @ApiModelProperty("评论数量")
    private Integer comments;

    @ApiModelProperty("标签Id")
    private Integer tagId;

    @ApiModelProperty("标签名称列表")
    private List<Tag> tagName;
}
