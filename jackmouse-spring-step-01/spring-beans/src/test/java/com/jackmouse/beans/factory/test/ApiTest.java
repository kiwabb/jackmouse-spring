package com.jackmouse.beans.factory.test;

import com.jackmouse.beans.factory.BeanFactory;
import com.jackmouse.beans.factory.test.bean.UserService;
import com.jackmouse.beans.factory.config.BeanDefinition;
import org.junit.Test;

/**
 * @ClassName ApiTest
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/14 23:09
 * @Version 1.0
 **/
public class ApiTest {
    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        BeanDefinition beanDefinition = new BeanDefinition(new UserService());
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        // 3.获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
