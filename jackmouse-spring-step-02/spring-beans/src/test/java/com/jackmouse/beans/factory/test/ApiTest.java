package com.jackmouse.beans.factory.test;

import com.jackmouse.beans.factory.support.DefaultListableBeanFactory;
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
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        // 2.注册 bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 3.第一次获取 bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
        // 4.第二次获取 bean from Singleton
        UserService userService_singleton = (UserService) beanFactory.getBean("userService");
        userService_singleton.queryUserInfo();
    }
}
