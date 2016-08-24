package com.zju;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ted on 16/8/23.
 */
public class Main {

    public static void main(String[] args){
        System.out.println("Java Web Code Generator Start.");

        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext(new String[]{"classpath:spring/spring-config.xml"});

        CodeGen codeGen=context.getBean(CodeGen.class);
        codeGen.run();
    }
}
