package com.mytests.spring.innerConfigBeansTest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.GenericXmlContextLoader;

/**
 * *******************************
 * Created by Irina.Petrovskaya on 7/25/2019.
 * Project: inner-config-beans
 * *******************************
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(loader = GenericXmlContextLoader.class)
public class XmlConfigDefaultTest {


    @Autowired
    private Service1Impl1 impl1;
    @Autowired
    private Service1Impl2 impl2;

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @Test
    public void testConfig1() {
        //
        Assert.assertNotNull(impl1);


    }
    @Test
    public void testConfig2() {
        //
        Assert.assertNotNull(impl2);


    }
}
