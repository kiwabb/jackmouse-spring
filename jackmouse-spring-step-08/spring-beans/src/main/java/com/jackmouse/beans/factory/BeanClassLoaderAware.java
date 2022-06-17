package com.jackmouse.beans.factory;

/**
 * @ClassName BeanClassLoaderAware
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 23:07
 * @Version 1.0
 **/
public interface BeanClassLoaderAware extends Aware{
    /**
     * 实现此接口，既能感知到所属的 ClassLoader
     * @param classLoader
     */
    void setBeanClassLoader(ClassLoader classLoader);
}
