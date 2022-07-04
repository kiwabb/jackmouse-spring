package com.jackmouse.test.common;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.PropertyValue;
import com.jackmouse.beans.PropertyValues;
import com.jackmouse.beans.factory.config.BeanDefinition;
import com.jackmouse.beans.factory.config.BeanFactoryPostProcessor;
import com.jackmouse.beans.factory.config.ConfigurableListableBeanFactory;

public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}
