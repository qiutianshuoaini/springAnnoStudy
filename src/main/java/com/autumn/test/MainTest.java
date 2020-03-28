package com.autumn.test;

import com.autumn.bean.Person;
import com.autumn.config.SpringConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainTest {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = context.getBean("person", Person.class);
//        System.out.println(person);

        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }
    }
}
