package com.jackmouse.beans.factory.config;

import com.jackmouse.beans.BeansException;

/**
 * @ClassName BeanFactoryPostProcessor
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/16 18:28
 * @Version 1.0
 **/
public interface BeanFactoryPostProcessor {

    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;

}
