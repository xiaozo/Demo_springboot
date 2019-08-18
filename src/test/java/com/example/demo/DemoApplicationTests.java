package com.example.demo;

import com.example.demo.conditional.I18n;
import com.example.demo.config.MyMvcConfigurer;
import com.example.demo.model.MyGetterb;
import com.example.demo.model.Person;
//import com.google.gson.Gson;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    Person person;

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
    }


}
