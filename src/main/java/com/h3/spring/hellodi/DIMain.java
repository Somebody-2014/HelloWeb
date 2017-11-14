package com.h3.spring.hellodi;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.di.xml");
        Knight knight = context.getBean(Knight.class);
        knight.embarkOnQuest();
        context.close();
    }
}
