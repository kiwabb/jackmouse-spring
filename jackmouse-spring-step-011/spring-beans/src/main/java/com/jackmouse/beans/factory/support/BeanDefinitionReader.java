package com.jackmouse.beans.factory.support;

import com.jackmouse.beans.BeansException;
import com.jackmouse.core.io.Resource;
import com.jackmouse.core.io.ResourceLoader;

/**
 * @ClassName BeanDefinitionReader
 * @Description Bean定义读取接口
 * @Author zhoujiaangyao
 * @Date 2022/6/16 14:08
 * @Version 1.0
 **/
public interface BeanDefinitionReader {

    /**
     * 获取 BeanDefinitionRegistry
     * @return
     */
    BeanDefinitionRegistry getRegistry();

    /**
     * 获取 ResourceLoader
     * @return
     */
    ResourceLoader getResourceLoader();

    /**
     * 由单个资源加载BeanDefinition
     * @param resource
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource resource) throws BeansException;

    /**
     * 由多个资源加载BeanDefinition
     * @param resources
     * @throws BeansException
     */
    void loadBeanDefinitions(Resource... resources) throws BeansException;

    /**
     * 由资源地址加载BeanDefinition
     * @param location
     * @throws BeansException
     */
    void loadBeanDefinitions(String location) throws BeansException;

    /**
     * 由多个资源地址加载BeanDefinition
     * @param locations
     * @throws BeansException
     */
    void loadBeanDefinitions(String... locations) throws BeansException;

}
