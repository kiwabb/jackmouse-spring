package com.jackmouse.beans.factory;

import com.jackmouse.beans.BeansException;

/**
 * @ClassName NoSuchBeanDefinitionException
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 19:20
 * @Version 1.0
 **/
public class NoSuchBeanDefinitionException extends BeansException {

    private final String beanName;

    public NoSuchBeanDefinitionException(String name) {
        super("No bean named '" + name + "' available");
        this.beanName = name;
    }


    public NoSuchBeanDefinitionException(String name, String message) {
        super("No bean named '" + name + "' available: " + message);
        this.beanName = name;
    }
}
