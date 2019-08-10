package com.example.demo.until;

import java.time.Year;

public class AppTool {
   public static String bosStr(Boolean boss) {
       if (boss== null) return "不是老板";
        return  boss.booleanValue() == true ? "老板" : "不是老板";
    }
}
