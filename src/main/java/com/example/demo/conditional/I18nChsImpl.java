package com.example.demo.conditional;

import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
@Conditional(I18nChsCondition.class)

public class I18nChsImpl implements I18n {
    Map<String, String> map = new HashMap<String, String>() {

        private static final long serialVersionUID = 1L;

        {
            put("lang", "中文");
        }
    };

    @Override
    public String i18n(String name) {
        return map.get(name);
    }

}
