package com.h3.spring.wiringbean;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan  //启用组件扫描
//@ComponentScan("com.h3.spring.wiringbean") //指定包名
@ComponentScan(basePackages = {"com.h3.spring.wiringbean"})  //指定多个包
public class CDPlayerConfig {

}
