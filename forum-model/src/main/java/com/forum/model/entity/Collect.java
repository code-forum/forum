package com.forum.model.entity;

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
@ApiModel(value = "Collect对象", description = "")
public class Collect extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("用户Id")
    private String userId;

    @ApiModelProperty("收藏夹名称")
    private String collectName;
}
