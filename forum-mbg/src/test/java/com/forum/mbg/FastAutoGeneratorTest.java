package com.forum.mbg;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

/**
 * @author code-messenger
 * @since 2022/9/4 14:23
 */
public class FastAutoGeneratorTest {
    
    public static void main(String[] args) {
        FastAutoGenerator.create("jdbc:mysql://112.124.10.0:3306/forum?serverTimezone=Asia/Shanghai", "root", "Zxcv0812.").globalConfig(builder -> {
                    builder.author("code-messenger") // 设置作者
                            .enableSwagger() // 开启 swagger 模式
                            .fileOverride() // 覆盖已生成文件
                            .outputDir("D://mybatis-mbg"); // 指定输出目录
                }).packageConfig(builder -> {
                    builder.parent("com.forum.mbg") // 设置父包名
                            .moduleName("forum") // 设置父包模块名
                            .pathInfo(Collections.singletonMap(OutputFile.xml, "D://mybatis-mbg")); // 设置mapperXml生成路径
                }).strategyConfig(builder -> {
                }).templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                .execute();
    }
}
