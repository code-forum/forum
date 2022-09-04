package com.forum.web;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @projectName: forum
 * @package: com.forum.web
 * @className: ForumWebApplication
 * @author: 李晓龙
 * @description: web启动器
 * @date: 2022/9/4 12:31
 * @version: 1.0
 */
@SpringBootApplication
@ComponentScan("com.forum")
@MapperScan("com.forum.dao")
public class ForumWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(ForumWebApplication.class,args);
    }
}
