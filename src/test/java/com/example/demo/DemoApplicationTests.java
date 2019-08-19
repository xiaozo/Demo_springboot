package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.conditional.I18n;
import com.example.demo.config.MyMvcConfigurer;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.MyGetterb;
import com.example.demo.model.Person;
//import com.google.gson.Gson;
import com.example.demo.model.User;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.awt.*;
import java.util.Map;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@MapperScan(value = "com.example.demo.mapper")
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    Person person;

    @Autowired
    private SqlSession sqlSession;

    @Test
    public void contextLoads() {
        
    }

    @Test
    public void personTest() {
       System.out.print(this.person);
    }

    @Test
    public void conditionalTest() {
        I18n i18n = this.applicationContext.getBean(I18n.class);
        System.out.println(i18n.getClass().getName());
        System.out.println(i18n.i18n("lang"));
    }

    @Test
    public void getterbTest() {
        Person gets = new Person();
        gets.setBoss(false);
        System.out.println(JSON.toJSONString(gets));
    }

    @Test
    public void userList(){
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user =  userMapper.getUserById(1);
        System.out.println(JSON.toJSONString(user));
    }


}
