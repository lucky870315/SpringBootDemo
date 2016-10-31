package com.example.study.conditional;

import com.example.study.aware.AwareConfig;
import com.example.study.aware.AwareDemoService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * author: zf
 * Date: 2016/10/28  16:34
 * Description:
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ConditionConfig.class);
        ListService bean = context.getBean(ListService.class);
        String s = bean.showListCmd();
        System.out.println(s);
        context.close();
    }
}