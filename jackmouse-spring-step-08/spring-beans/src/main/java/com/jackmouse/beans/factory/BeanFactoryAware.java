package com.jackmouse.beans.factory;

import com.jackmouse.beans.BeansException;

/**
 * @ClassName BeanFactoryAware
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 23:06
 * @Version 1.0
 **/
public interface BeanFactoryAware extends Aware{
    /**
     * 实现此接口，既能感知到所属的 BeanFactory
     * @param beanFactory
     * @throws BeansException
     */
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
