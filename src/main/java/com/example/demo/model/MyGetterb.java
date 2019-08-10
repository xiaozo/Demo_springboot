package com.example.demo.model;

import com.mythsman.test.BindView;
import com.mythsman.test.BindViews;
import com.mythsman.test.Getterb;

//@Getterb
@BindViews
public class MyGetterb {

    @BindView
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
