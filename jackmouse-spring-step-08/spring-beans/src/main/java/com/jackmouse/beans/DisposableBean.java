package com.jackmouse.beans;

/**
 * @ClassName DisposableBean
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 22:17
 * @Version 1.0
 **/
public interface DisposableBean {

    /**
     * bean销毁后调用
     * @throws Exception
     */
    void destroy() throws Exception;

}
