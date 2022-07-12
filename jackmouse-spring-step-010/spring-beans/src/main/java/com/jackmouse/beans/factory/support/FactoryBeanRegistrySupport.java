package com.jackmouse.beans.factory.support;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.FactoryBean;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @ClassName FactoryBeanRegistrySupport
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/7/4 18:53
 * @Version 1.0
 **/
public abstract class FactoryBeanRegistrySupport extends DefaultSingletonBeanRegistry {

    /** Cache of singleton objects created by FactoryBeans: FactoryBean name to object. */
    private final Map<String, Object> factoryBeanObjectCache = new ConcurrentHashMap<>(16);

    protected Object getCachedObjectForFactoryBean(String beanName) {
        Object object = this.factoryBeanObjectCache.get(beanName);
        return (object != NULL_OBJECT ? object : null);
    }

    protected Object getObjectFromFactoryBean(FactoryBean factory, String beanName) {
        if (factory.isSingleton()) {
            Object object = this.factoryBeanObjectCache.get(beanName);
            if (object == null) {
                object = doGetObjectFromFactoryBean(factory, beanName);
                this.factoryBeanObjectCache.put(beanName, (object != null ? object : NULL_OBJECT));
            }
            return (object != NULL_OBJECT ? object : null);
        } else {
            return doGetObjectFromFactoryBean(factory, beanName);
        }
    }

    private Object doGetObjectFromFactoryBean(final FactoryBean factory, final String beanName){
        try {
            return factory.getObject();
        } catch (Exception e) {
            throw new BeansException("FactoryBean threw exception on object[" + beanName + "] creation", e);
        }
    }
}
