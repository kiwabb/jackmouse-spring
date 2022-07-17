package com.jackmouse.beans.factory;

/**
 * @ClassName InitializingBean
 * @Description 实现此接口的 Bean 对象，会在 BeanFactory 设置属性后作出相应的处理，如：执行自定义初始化，或者仅仅检查是否设置了所有强制属性。
 * @Author zhoujiaangyao
 * @Date 2022/6/17 22:15
 * @Version 1.0
 **/
public interface InitializingBean {

    /**
     * BeanFactory 处理了属性填充后调用
     * @throws Exception
     */
    void afterPropertiesSet() throws Exception;
}
