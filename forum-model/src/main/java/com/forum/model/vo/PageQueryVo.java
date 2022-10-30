package com.forum.model.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 李晓龙
 * @version 1.0
 * @description: 页面查询VO
 * @date 2022/10/29 21:08
 */
@Data
@ApiModel(value = "PageQueryVo", description = "分页查询模型")
public class PageQueryVo {

    @ApiModelProperty("页面记录数据")
    private Integer pageNum;

    @ApiModelProperty("当前页面数")
    private Integer pageSize;

    @ApiModelProperty("查询条件对象")
    private ContentVo t;



}
