package com.example.springstudy.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class IocCodeSourceTest {

    @Autowired
    private ApplicationContext applicationContext;

    @Test
    public void test_sourceCode_01() {
        Object bean = applicationContext.getBean("a");
        Object bean1 = applicationContext.getBean("b");
        //通过在此打断点设置可以发现，A和B都初始化完成了
        System.out.println(bean);
        System.out.println(bean1);
    }

}
