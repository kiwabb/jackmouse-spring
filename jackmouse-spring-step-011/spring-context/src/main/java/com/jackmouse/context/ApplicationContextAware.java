package com.jackmouse.context;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.Aware;

/**
 * @ClassName ApplicationContextAware
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 23:10
 * @Version 1.0
 **/
public interface ApplicationContextAware extends Aware {
    /**
     * 实现此接口，既能感知到所属的 ApplicationContext
     * @param applicationContext
     * @throws BeansException
     */
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
