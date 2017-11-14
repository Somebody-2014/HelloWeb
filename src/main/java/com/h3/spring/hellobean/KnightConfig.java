package com.h3.spring.hellobean;

import com.h3.spring.hellodi.BraveKnight;
import com.h3.spring.hellodi.Knight;
import com.h3.spring.hellodi.Quest;
import com.h3.spring.hellodi.SlayDragonQuest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class KnightConfig {
    @Bean
    public Knight knight(){
        return new BraveKnight(quest());

    }
    @Bean
    public Quest quest(){
        return new SlayDragonQuest(System.out);
    }
}
