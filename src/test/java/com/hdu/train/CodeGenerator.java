package com.hdu.train;

import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.engine.FreemarkerTemplateEngine;

import java.util.Collections;

    public class CodeGenerator {
        public static void main(String[] args){
            String url = "jdbc:mysql:///train";
            String username = "root";
            String password = "admin123";
            String tables= "user,order,passenger,seat,train,station";
            String mapperLocation = "D:\\Code\\train\\src\\main\\resources\\mapper\\" ;
            FastAutoGenerator.create(url, username, password)
                    .globalConfig(builder -> {
                        builder.author("zq") // 设置作者
                                .outputDir("D:\\Code\\Train\\src\\main\\java\\com\\hdu\\train"); // 指定输出目录
                    })
                    .packageConfig(builder -> {
                        builder // 设置父包名
//                                .moduleName("") // 设置父包模块名
                                .pathInfo(Collections.singletonMap(OutputFile.xml, mapperLocation)); // 设置mapperXml生成路径
                    })
                    .strategyConfig(builder -> {
                        builder.addInclude(tables) // 设置需要生成的表名
                                .addTablePrefix(); // 设置过滤表前缀
                    })
                    .templateEngine(new FreemarkerTemplateEngine()) // 使用Freemarker引擎模板，默认的是Velocity引擎模板
                    .execute();
        }

    }

