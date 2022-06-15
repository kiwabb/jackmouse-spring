package com.jackmouse.beans.factory.support;

import com.jackmouse.beans.factory.config.BeanDefinition;

/**
 * @ClassName BeanDefinitionRegistry
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 19:15
 * @Version 1.0
 **/
public interface BeanDefinitionRegistry {
    /**
     * 注册beanDefinition
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
