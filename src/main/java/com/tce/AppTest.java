package com.tce;

import com.tce.service.MonsterService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppTest {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        MonsterService beanA = (MonsterService) context.getBean("monsterServiceImpl");
    }
}