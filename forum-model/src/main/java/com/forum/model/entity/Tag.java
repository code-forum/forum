package com.forum.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 标签表
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@ApiModel(value = "Tag对象", description = "标签表")
public class Tag extends BaseEntity {

    private static final long serialVersionUID = 1L;
    
    @ApiModelProperty("标签名称")
    private String tagName;

}
