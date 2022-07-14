package com.jackmouse.beans.factory.support;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.config.SingletonBeanRegistry;
import com.jackmouse.beans.DisposableBean;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName DefaultSingletonBeanRegistry
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 18:48
 * @Version 1.0
 **/
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    /**
     * 单例池
     */
    private final Map<String, Object> singletonObjects = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    /**
     * Internal marker for a null singleton object:
     * used as marker value for concurrent Maps (which don't support null values).
     */
    protected static final Object NULL_OBJECT = new Object();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    protected void addSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }

    public void destroySingletons() {
        Set<String> keySet = this.disposableBeans.keySet();
        Object[] disposableBeanNames = keySet.toArray();

        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            Object beanName = disposableBeanNames[i];
            DisposableBean disposableBean = disposableBeans.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }
    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

}
