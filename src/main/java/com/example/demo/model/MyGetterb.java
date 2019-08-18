package com.example.demo.model;

import com.mythsman.test.BindView;
import com.mythsman.test.Getterb;

//@Getterb
public class MyGetterb {

    @BindView(obj = "com.example.demo.until.AppTool",meth = "lastNames")
    private String lastNames;

    public MyGetterb(String lastNames) {
        this.lastNames = lastNames;
    }

    @Override
    public String toString() {
        return "MyGetterb{" +
                "lastName='" + lastNames + '\'' +
                '}';
    }
}
