package com.h3.spring.wiringbean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AutoWiringMain {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext contextClass = new ClassPathXmlApplicationContext("spring.autowiring.xml");
        CompactDisc cd = contextClass.getBean(CompactDisc.class);
        new CDPlayer(cd).play();
    }
}
