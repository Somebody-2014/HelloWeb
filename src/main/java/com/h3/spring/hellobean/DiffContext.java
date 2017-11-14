package com.h3.spring.hellobean;

import com.h3.spring.hellodi.Knight;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class DiffContext {
    public static void main(String[] args) {
        //从java配置类中加载应用上下文
        AnnotationConfigApplicationContext contextJava = new AnnotationConfigApplicationContext(KnightConfig.class);
        Knight knight1 = (Knight) contextJava.getBean("knight");
        knight1.embarkOnQuest();
        //从类路径下加载应用上下文
        ClassPathXmlApplicationContext contextClass = new ClassPathXmlApplicationContext("spring.xml");
        Knight knight2 = contextClass.getBean(Knight.class);
        knight2.embarkOnQuest();
        //从文件系统加载应用上下文
        FileSystemXmlApplicationContext contextFile = new FileSystemXmlApplicationContext("F:\\Intellij IEDA_Workspace\\HelloWeb\\src\\main\\resources\\spring.xml");
        Knight knight3 = contextFile.getBean(Knight.class);
        knight3.embarkOnQuest();

        //Spring Web应用上下文
        //AnnotationConfigWebApplicationContext  通过java配置类加载web应用上下文
        //XmlWebApplicationContext 通过xml配置文件加载web应用上下文
    }
}
