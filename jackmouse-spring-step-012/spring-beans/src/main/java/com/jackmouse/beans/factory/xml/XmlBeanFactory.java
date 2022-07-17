package com.jackmouse.beans.factory.xml;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.BeanFactory;
import com.jackmouse.beans.factory.support.DefaultListableBeanFactory;
import com.jackmouse.core.io.Resource;

/**
 * @ClassName XmlBeanFactory
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/7/17 16:49
 * @Version 1.0
 **/
public class XmlBeanFactory extends DefaultListableBeanFactory {
    private final XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(this);
    /**
     * Create a new XmlBeanFactory with the given resource,
     * which must be parsable using DOM.
     * @param resource the XML resource to load bean definitions from
     * @throws BeansException in case of loading or parsing errors
     */
    public XmlBeanFactory(Resource resource) throws BeansException {
        this(resource, null);
    }
    public XmlBeanFactory(Resource resource, BeanFactory parentBeanFactory) throws BeansException {
        this.reader.loadBeanDefinitions(resource);
    }
}
