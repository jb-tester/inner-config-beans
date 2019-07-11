package com.mytests.spring.innerConfigBeansTest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/4/2019.
 * Project: inner-config-beans
 * *******************************
 */
public class RunMe {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(MainConfig.class);
        System.out.println("============ all beans: ==============================");
        for (String beanDefinitionName : ctx.getBeanDefinitionNames()) {
            System.out.println(beanDefinitionName);
        }
        System.out.println("==========================================");
        System.out.println(ctx.getBean(Bean1.class).getComponent1().getId());
    }

}
