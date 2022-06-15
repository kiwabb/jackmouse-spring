package com.jackmouse.beans.factory.support;

import com.jackmouse.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName DefaultSingletonBeanRegistry
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 18:48
 * @Version 1.0
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    /**
     * 单例池
     */
    private final Map<String, Object> singletonObjects = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
