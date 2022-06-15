package com.jackmouse.beans.factory.test;

import com.jackmouse.beans.PropertyValue;
import com.jackmouse.beans.PropertyValues;
import com.jackmouse.beans.factory.config.BeanReference;
import com.jackmouse.beans.factory.support.DefaultListableBeanFactory;
import com.jackmouse.beans.factory.test.bean.UserDao;
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
        // 2. UserDao 注册
        beanFactory.registerBeanDefinition("userDao", new BeanDefinition(UserDao.class));
        // 3. UserService 设置属性[uId、userDao]
        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId", "10002"));
        propertyValues.addPropertyValue(new PropertyValue("userDao",new BeanReference("userDao")));
        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);
        // 5. UserService 获取bean
        UserService userService = (UserService) beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
