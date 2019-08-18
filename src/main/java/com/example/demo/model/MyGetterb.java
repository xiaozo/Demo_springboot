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

<<<<<<< HEAD

=======
    public String getLastNames() {
        return lastNames;
    }

    public void setLastNames(String lastNames) {
        this.lastNames = lastNames;
    }
>>>>>>> d8b57fde8d67b3f4e41dc9c80a7d10ec3bc54840
}
