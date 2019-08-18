package com.example.demo;

import com.alibaba.fastjson.JSON;
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
<<<<<<< HEAD
        gets.setBoss(false);
        Gson gson = new Gson();
        String jsonObject = gson.toJson(gets); // {"name":"张三kidou","age":24}
        System.out.println(ConvertObjToMap(gets));
    }

    public Map ConvertObjToMap(Object obj){
        Map<String,Object> reMap = new HashMap<String,Object>();
        if (obj == null)
            return null;
        Field[] fields = obj.getClass().getDeclaredFields();
        try {
            for(int i=0;i<fields.length;i++){
                try {
                    Field f = obj.getClass().getDeclaredField(fields[i].getName());
                    f.setAccessible(true);
                    Object o = f.get(obj);
                    reMap.put(fields[i].getName(), o);
                } catch (NoSuchFieldException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalArgumentException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        } catch (SecurityException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return reMap;
    }
=======
        gets.setBoss(true);
        System.out.println(JSON.toJSONString(gets));

        MyGetterb myGetterb = new MyGetterb("厉害");
        System.out.println(JSON.toJSONString(myGetterb));
>>>>>>> d8b57fde8d67b3f4e41dc9c80a7d10ec3bc54840

    }


}
