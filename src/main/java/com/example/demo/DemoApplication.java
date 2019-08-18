package com.example.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.web.servlet.config.annotation.PathMatchConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

//使用MapperScan批量扫描所有的Mapper接口；
@MapperScan(value = "com.example.demo.mapper")
@SpringBootApplication
public class DemoApplication extends WebMvcConfigurationSupport {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    protected void configurePathMatch(PathMatchConfigurer configurer) {
        super.configurePathMatch(configurer);
        // 常用的两种
        // 匹配结尾 / :会识别 url 的最后一个字符是否为 /
        // localhost:8080/test 与 localhost:8080/test/ 等价
//        configurer.setUseTrailingSlashMatch(true);


        // 匹配后缀名：会识别 xx.* 后缀的内容
        // localhost:8080/test 与 localhost:8080/test.jsp 等价
        configurer.setUseSuffixPatternMatch(true);

    }


}
