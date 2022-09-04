package com.forum.model.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author code-messenger
 * @since 2022/9/3 19:31
 */
@Data
public class BaseEntity implements Serializable {
    
    @ApiModelProperty(value = "id")
    private Long id;
    
    @ApiModelProperty(value = "创建时间")
    @TableField(value = "create_time", fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    
    @ApiModelProperty(value = "修改时间")
    @TableField(value = "update_time", fill = FieldFill.UPDATE)
    private LocalDateTime updateTime;
    
    @ApiModelProperty(value = "逻辑删除 (1:已删除, 0:未删除)")
    private Integer isDeleted;
}
