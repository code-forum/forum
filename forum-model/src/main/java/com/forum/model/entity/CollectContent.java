package com.forum.model.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 用户收藏夹与文章关联表
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@TableName("collection_content")
@ApiModel(value = "CollectionContent对象", description = "用户收藏夹与文章关联表")
public class CollectContent extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("收藏夹Id")
    private Integer collectId;

    @ApiModelProperty("文章id")
    private Integer contentId;

}
