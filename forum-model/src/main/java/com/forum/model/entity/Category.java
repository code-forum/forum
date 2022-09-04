package com.forum.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * <p>
 * 分类实体
 * </p>
 *
 * @author code-messenger
 * @since 2022-09-04
 */
@Data
@ApiModel(value = "Category对象", description = "分类")
@TableName("category")
public class Category extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分类名称")
    private String categoryName;

    @ApiModelProperty("父id")
    private Integer pId;

    @ApiModelProperty("排序")
    private String code;

}
