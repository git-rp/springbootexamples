package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.print.Doc;

public class Main {
    public static void main(String[] args) {

       // ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);
        Doctor doc = (Doctor)context.getBean("doctor");
        doc.setQualification("MBBS");
        doc.assist();
        System.out.println(doc.getQualification());
        doc = (Doctor)context.getBean("doctor");
        System.out.println(doc.getQualification());
        System.out.println("Hello world!");
    }
}