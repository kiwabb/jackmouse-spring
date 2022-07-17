package com.jackmouse.beans.factory.config;

import com.jackmouse.beans.factory.HierarchicalBeanFactory;
import com.jackmouse.beans.factory.support.BeanDefinitionRegistry;

/**
 * @ClassName ConfigurableBeanFactory
 * @Description 对BeanFactory的配置功能，addBeanPostProcessor()配置bean的后置处理器
 * BeanFactory->HierarchicalBeanFactory->ConfigurableBeanFactory IOC容器路径1
 * @Author zhoujiaangyao
 * @Date 2022/6/16 18:32
 * @Version 1.0
 **/
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {
    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    /**
     * 添加 BeanPostProcessor
     * @param beanPostProcessor
     */
    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();
}
