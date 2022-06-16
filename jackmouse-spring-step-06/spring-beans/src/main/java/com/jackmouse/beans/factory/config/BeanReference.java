package com.jackmouse.beans.factory.config;

/**
 * @ClassName BeanReference
 * @Description Bean对象的引用
 * @Author zhoujiaangyao
 * @Date 2022/6/15 23:17
 * @Version 1.0
 **/
public class BeanReference {
    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
