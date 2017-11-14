package com.h3.spring.wiringbean;

import org.springframework.beans.factory.annotation.Autowired;

public class CDPlayer {
    @Autowired
    private CompactDisc cd;

    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
    }

    public CompactDisc getCd() {
        return cd;
    }

    public void play(){
        cd.play();
    }

}
