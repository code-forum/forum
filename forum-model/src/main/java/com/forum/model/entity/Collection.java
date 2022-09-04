package com.forum.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@ApiModel(value = "Collection对象", description = "")
public class Collection extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户Id")
    private String userId;

    @ApiModelProperty("收藏夹名称")
    private String collectionName;
}
