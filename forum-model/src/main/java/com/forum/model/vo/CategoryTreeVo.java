package com.forum.model.vo;

import com.forum.model.entity.BaseEntity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: 树形分类目录
 * @date 2022/10/30 16:59
 */
@Data
@ApiModel(value = "CategoryTreeVo", description = "树形分类id")
public class CategoryTreeVo extends BaseEntity {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty("分类名称")
    private String categoryName;

    @ApiModelProperty("父id")
    private Integer pId;

    @ApiModelProperty("排序")
    private String code;

    private List<CategoryTreeVo> children;
}
