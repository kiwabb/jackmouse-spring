package com.jackmouse.beans.factory.config;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.ListableBeanFactory;

/**
 * @ClassName ConfigurableListableBeanFactory
 * @Description 大多数bean工厂要实现的配置接口
 * @Author zhoujiaangyao
 * @Date 2022/6/16 18:39
 * @Version 1.0
 **/
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {
    /**
     * 获取bean定义
     * @param beanName
     * @return
     * @throws BeansException
     */
    BeanDefinition getBeanDefinition(String beanName) throws BeansException;
    /**
     * 提前实例化单例Bean对象
     * @throws BeansException
     */
    void preInstantiateSingletons() throws BeansException;
}
