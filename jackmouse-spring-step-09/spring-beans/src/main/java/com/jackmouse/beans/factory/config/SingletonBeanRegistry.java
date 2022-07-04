package com.jackmouse.beans.factory.config;

/**
 * @ClassName SingletonBeanRegistry
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 18:44
 * @Version 1.0
 **/
public interface SingletonBeanRegistry {
    /**
     * 获取指定名称的单例bean对象
     * @param beanName bean名称
     * @return 单例bean对象
     */
    Object getSingleton(String beanName);
}
