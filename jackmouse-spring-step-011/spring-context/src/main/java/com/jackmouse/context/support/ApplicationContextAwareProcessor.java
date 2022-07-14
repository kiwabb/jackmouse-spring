package com.jackmouse.context.support;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.config.BeanPostProcessor;
import com.jackmouse.context.ApplicationContext;
import com.jackmouse.context.ApplicationContextAware;

/**
 * @ClassName ApplicationContextAwareProcessor
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 23:11
 * @Version 1.0
 **/
public class ApplicationContextAwareProcessor implements BeanPostProcessor {

    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {
        this.applicationContext = applicationContext;
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware){
            ((ApplicationContextAware) bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
