package com.autumn.config;

import com.autumn.bean.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = "com.autumn")
public class SpringConfig {

    @Bean(value = "person01")
    public Person person() {
        return new Person("lisi",20);
    }
}
