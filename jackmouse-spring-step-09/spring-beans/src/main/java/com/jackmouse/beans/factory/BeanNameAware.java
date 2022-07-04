package com.jackmouse.beans.factory;

/**
 * @ClassName BeanNameAware
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 23:09
 * @Version 1.0
 **/
public interface BeanNameAware extends Aware{
    /**
     * 实现此接口，既能感知到所属的 BeanName
     * @param name
     */
    void setBeanName(String name);
}
