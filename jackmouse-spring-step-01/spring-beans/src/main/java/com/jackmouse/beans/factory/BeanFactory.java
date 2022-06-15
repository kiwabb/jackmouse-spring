package com.jackmouse.beans.factory;

import com.jackmouse.beans.factory.config.BeanDefinition;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BeanFactory
 * @Description bean工厂
 * @Author zhoujiaangyao
 * @Date 2022/6/14 23:02
 * @Version 1.0
 **/
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
