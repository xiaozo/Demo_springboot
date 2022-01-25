package com.example.demo.config;


import com.example.demo.servlet.DemoFilter;
import com.example.demo.servlet.DemoListener;
import com.example.demo.servlet.DemoServlet;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyServletConfig {

    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){

        ServletRegistrationBean bean = new ServletRegistrationBean(new DemoServlet());

        bean.addUrlMappings("/second");

        return bean;

    }

    @Bean

    public FilterRegistrationBean getFilterRegistrationBean(){

        FilterRegistrationBean bean = new FilterRegistrationBean(new DemoFilter());

        //bean.addUrlPatterns(new String[]{"*.do","*.jsp"});

        bean.addUrlPatterns("/second");

        return bean;

    }

    /**

     * 注册listener

     */

    @Bean

    public ServletListenerRegistrationBean<DemoListener> getServletListenerRegistrationBean(){

        ServletListenerRegistrationBean<DemoListener> bean= new ServletListenerRegistrationBean<DemoListener>(new DemoListener());

        return bean;

    }


}
