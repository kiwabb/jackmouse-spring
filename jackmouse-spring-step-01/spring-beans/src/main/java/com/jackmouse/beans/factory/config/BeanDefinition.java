package com.jackmouse.beans.factory.config;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName BeanDefinition
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/14 23:06
 * @Version 1.0
 **/
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
