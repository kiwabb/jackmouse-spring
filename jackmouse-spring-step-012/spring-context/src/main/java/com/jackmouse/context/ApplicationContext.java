package com.jackmouse.context;

import com.jackmouse.beans.factory.HierarchicalBeanFactory;
import com.jackmouse.beans.factory.ListableBeanFactory;
import com.jackmouse.core.io.ResourceLoader;

/**
 * @ClassName ApplicationContext
 * @Description 应用上下文， 通过继承ResourceLoader，ApplicationEventPublisher在简单IOC容器的基础上添加了许多高级容器的特性与支持
 * BeanFactory->ListableBeanFactory->ApplicationContext
 * @Author zhoujiaangyao
 * @Date 2022/6/16 23:58
 * @Version 1.0
 **/
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
