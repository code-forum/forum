package com.forum.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * 文章表
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@ApiModel(value = "Content对象", description = "文章表")
public class Content extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("文章名称")
    private String contentName;

    @ApiModelProperty("文章内容")
    private String articleContent;

    @ApiModelProperty("分类Id")
    private String categoryId;

    @ApiModelProperty("点赞Id")
    private String thunbsUpId;

    @ApiModelProperty("评论Id")
    private Integer comentsId;

    @ApiModelProperty("标签Id")
    private Integer tagId;
}
