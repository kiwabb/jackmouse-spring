package com.jackmouse.beans.factory;

/**
 * @ClassName FactoryBean
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/7/4 18:51
 * @Version 1.0
 **/
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();

}
