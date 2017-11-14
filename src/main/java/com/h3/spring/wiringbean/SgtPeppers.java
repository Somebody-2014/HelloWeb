package com.h3.spring.wiringbean;

import org.springframework.stereotype.Component;

@Component   //表明该类作为组件类，Spring要为这个类创建bean
public class SgtPeppers implements CompactDisc {
    private String title = "Sgt. Pepper's Lonely Hearts Club Band";
    private String artist="The Beatles";
    public void play() {
        System.out.println("Playing "+title+" by "+artist);
    }
}
