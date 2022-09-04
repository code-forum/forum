package com.forum.base.Handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @projectName: forum
 * @package: com.forum.base.Handler
 * @className: MybatisPlusHandler
 * @author: 李晓龙
 * @description: mp自动添加Handler
 * @date: 2022/9/4 16:46
 * @version: 1.0
 */
@Component
public class MybatisPlusHandler  implements MetaObjectHandler {

    /**
     * 修改时间
     * @param metaObject
     */
    @Override
    public void updateFill(MetaObject metaObject) {
        this.setFieldValByName("updateTime",new Date(),metaObject);
    }

    /**
     * 添加时间
     * @param metaObject
     */
    @Override
    public void insertFill(MetaObject metaObject) {
        //设置属性值
        this.setFieldValByName("create_time",new Date(),metaObject);
        this.setFieldValByName("update_time",new Date(),metaObject);
        this.setFieldValByName("is_deleted",0,metaObject);

    }
}
