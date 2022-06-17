package com.jackmouse.beans.factory.support;

import com.jackmouse.core.io.DefaultResourceLoader;
import com.jackmouse.core.io.ResourceLoader;

/**
 * @ClassName AbstractBeanDefinitionReader
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/16 14:13
 * @Version 1.0
 **/
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
