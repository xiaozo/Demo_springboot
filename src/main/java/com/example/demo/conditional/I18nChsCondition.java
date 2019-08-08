package com.example.demo.conditional;


import org.springframework.boot.autoconfigure.condition.ConditionOutcome;
import org.springframework.boot.autoconfigure.condition.SpringBootCondition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class I18nChsCondition extends SpringBootCondition {

    @Override
    public ConditionOutcome getMatchOutcome(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String lang = context.getEnvironment().getProperty("i18n.lang");
        ConditionOutcome outCome = new ConditionOutcome("zh_CN".equals(lang), "i18n.lang=" + lang);
        return outCome;
    }
}