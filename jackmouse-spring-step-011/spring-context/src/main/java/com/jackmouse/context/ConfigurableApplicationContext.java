package com.jackmouse.context;

import com.jackmouse.beans.BeansException;

/**
 * @ClassName ConfigurableApplicationContext
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 00:07
 * @Version 1.0
 **/
public interface ConfigurableApplicationContext extends ApplicationContext {
    /**
     * 刷新容器
     *
     * @throws BeansException
     */
    void refresh() throws BeansException;

    /**
     * 注册关闭钩子
     */
    void registerShutdownHook();

    /**
     * 关闭容器
     */
    void close();
}
