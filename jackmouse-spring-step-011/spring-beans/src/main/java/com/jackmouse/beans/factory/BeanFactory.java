package com.jackmouse.beans.factory;

import com.jackmouse.beans.BeansException;

/**
 * @ClassName BeanFactory
 * @Description bean工厂
 * @Author zhoujiaangyao
 * @Date 2022/6/14 23:02
 * @Version 1.0
 **/
public interface BeanFactory {
    /**
     * 根据名称获取bean对象
     * @param name 名称
     * @return bean对象
     * @throws BeansException
     */
    Object getBean(String name) throws BeansException;

    /**
     * 根据名称和参数获取bean对象
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 根据名称和class类型获取bean对象
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
