package com.mytests.spring.innerConfigBeansTest;

import javax.annotation.Resource;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/4/2019.
 * Project: inner-config-beans
 * *******************************
 */
public class Bean1 {


   //@Resource(name = "component1")  // incorrect name!
   @Resource(name = "com.mytests.spring.innerConfigBeansTest.MainConfig$Component1") // correct name!
    private MainConfig.Component1 component1;

    //@Resource(name = "innerConfig")   // incorrect!
    @Resource(name = "mainConfig.InnerConfig")     // correct!
    private MainConfig.InnerConfig ic;


    public MainConfig.Component1 getComponent1() {
        return component1;
    }
}
