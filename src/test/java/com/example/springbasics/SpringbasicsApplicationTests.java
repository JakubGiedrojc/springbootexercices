package com.example.springbasics;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class SpringbasicsApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void printBean(){ AnnotationConfigApplicationContext context=
        new AnnotationConfigApplicationContext(SpringbasicsApplication.class);
        System.out.println("[Beans]");
        for (String beanDefinitionName:context.getBeanDefinitionNames()){
            System.out.println(beanDefinitionName);
        }
        System.out.println("End Of Beans");

    }

}
