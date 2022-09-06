package com.forum.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 点赞表
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@TableName("thumbs_up")
@ApiModel(value = "ThumbsUp对象", description = "点赞表")
public class ThumbsUp extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("点赞文章Id")
    private Integer contentId;

    @ApiModelProperty("点赞数量")
    private Long thumbsUpNums;

    @ApiModelProperty("点赞用户Id")
    private Integer userId;

}
