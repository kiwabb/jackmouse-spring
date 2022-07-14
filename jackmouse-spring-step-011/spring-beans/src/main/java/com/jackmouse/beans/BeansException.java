package com.jackmouse.beans;

/**
 * @ClassName BeansException
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 18:55
 * @Version 1.0
 **/
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }
}
