package com.example.demo;

import com.alibaba.fastjson.JSON;
import com.example.demo.conditional.I18n;
import com.example.demo.mapper.GenMapper;
import com.example.demo.mapper.UserMapper;
import com.example.demo.model.Gen;
import com.example.demo.model.Person;
//import com.google.gson.Gson;
import com.example.demo.model.User;
import com.example.demo.service.HelloService;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

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


    @Resource
    private UserMapper userMapper;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @Autowired
    RedisTemplate redisTemplate;


    Logger logger = LoggerFactory.getLogger(getClass());

    @Test
    public void contextLoads() {
        HelloService h = (HelloService) applicationContext.getBean("helloService02");
        System.out.println(h);
    }

    @Test
    public void personTest() {
        System.out.println(JSON.toJSONString(this.person));
    }

    @Test
    public void conditionalTest() {
        I18n i18n = this.applicationContext.getBean(I18n.class);
        System.out.println(i18n.getClass().getName());
        System.out.println(i18n.i18n("lang"));
    }


    @Test
    public void userList(){
//        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        User user =  userMapper.getUserById(1);
        System.out.println(JSON.toJSONString(user));
    }


    @Test
    public void redisStr(){
//        stringRedisTemplate.opsForValue().append("msg","test2");
        stringRedisTemplate.opsForValue().set("msg","test2");
        System.out.println(JSON.toJSONString(stringRedisTemplate.opsForValue().get("msg")));
    }

    @Test
    public void redisObj(){

    }


}
