package com.mytests.spring.innerConfigBeansTest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/4/2019.
 * Project: inner-config-beans
 * *******************************
 */
@Configuration
@ComponentScan
public class MainConfig {

    @Bean
    public Bean1 bean1() {
        return new Bean1();
    }

    @Configuration
    public static class InnerConfig {

    }

    @Component
    public class Component1 {
       @Value("c1")
       String id;

        String getId() {
            return id;
        }
    }

}
