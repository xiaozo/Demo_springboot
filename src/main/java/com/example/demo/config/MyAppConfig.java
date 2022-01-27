package com.example.demo.config;

import com.example.demo.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @Configuration：指明当前类是一个配置类；就是来替代之前的Spring配置文件 同时也在容器中添加MyAppConfig
 *
 * 在配置文件中用<bean><bean/>标签添加组件
 *
 */
@Configuration
public class MyAppConfig {
    //将方法的返回值添加到容器中；容器中这个组件默认的id就是方法名
    @Primary
    @Bean
    public HelloService helloService02(){
        System.out.println("配置类@Bean给容器中添加组件了...");
        HelloService h = new HelloService();
        return h;
    }


    @Bean
    public MyMvcConfigurer myMvcConfigurer () {
        return new MyMvcConfigurer();
    }
}
