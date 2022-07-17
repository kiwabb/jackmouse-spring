package com.jackmouse.core.io;

/**
 * @ClassName ResourceLoader
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/16 14:01
 * @Version 1.0
 **/
public interface ResourceLoader {
    /**
     * 从类路径加载的伪 URL 前缀: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
