package com.jackmouse.context.support;

import com.jackmouse.beans.factory.support.DefaultListableBeanFactory;
import com.jackmouse.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @ClassName AbstractXmlApplicationContext
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/17 00:34
 * @Version 1.0
 **/
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {
    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations){
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }
    }

    /**
     * 配置文件地址
     * @return
     */
    protected abstract String[] getConfigLocations();
}
