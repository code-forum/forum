package com.forum.model.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 评论表
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@ApiModel(value = "Comments对象", description = "评论表")
public class Comments extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("评论内容")
    private String commentsContent;

    @ApiModelProperty("评论文章")
    private Integer contentId;

    @ApiModelProperty("评论用户Id")
    private Integer userId;

    @ApiModelProperty("回复评论Id")
    private Integer pId;
    
}
