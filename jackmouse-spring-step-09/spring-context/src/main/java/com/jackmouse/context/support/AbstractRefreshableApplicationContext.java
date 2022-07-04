package com.jackmouse.context.support;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.config.ConfigurableListableBeanFactory;
import com.jackmouse.beans.factory.support.DefaultListableBeanFactory;

/**
 * @ClassName AbstractRefreshableApplicationContext
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 00:29
 * @Version 1.0
 **/
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {
    private DefaultListableBeanFactory beanFactory;
    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }
    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    /**
     * 加载BeanDefinition 模版方法
     * @param beanFactory
     */
    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
