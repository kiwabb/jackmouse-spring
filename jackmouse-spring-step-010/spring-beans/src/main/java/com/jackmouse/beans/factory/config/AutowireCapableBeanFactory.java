package com.jackmouse.beans.factory.config;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.BeanFactory;

/**
 * @ClassName AutowireCapableBeanFactory
 * @Description 由能够自动装配的 bean 工厂实现
 * @Author zhoujiaangyao
 * @Date 2022/6/16 18:50
 * @Version 1.0
 **/
public interface AutowireCapableBeanFactory extends BeanFactory {

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessBeforeInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsBeforeInitialization(Object existingBean, String beanName) throws BeansException;

    /**
     * 执行 BeanPostProcessors 接口实现类的 postProcessorsAfterInitialization 方法
     *
     * @param existingBean
     * @param beanName
     * @return
     * @throws BeansException
     */
    Object applyBeanPostProcessorsAfterInitialization(Object existingBean, String beanName) throws BeansException;

}
