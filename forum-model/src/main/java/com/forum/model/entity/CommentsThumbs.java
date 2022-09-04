package com.forum.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 评论点赞表
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@TableName("comments_thumbs")
@ApiModel(value = "CommentsThumbs对象", description = "评论点赞表")
public class CommentsThumbs extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("评论Id")
    private String commentsId;

    @ApiModelProperty("点赞数量")
    private String commentsNums;

    @ApiModelProperty("评论用户id")
    private Integer userId;
    
}
