package com.jackmouse.context;

import com.jackmouse.beans.factory.HierarchicalBeanFactory;
import com.jackmouse.beans.factory.ListableBeanFactory;
import com.jackmouse.core.io.ResourceLoader;

/**
 * @ClassName ApplicationContext
 * @Description 应用上下文
 * @Author zhoujiaangyao
 * @Date 2022/6/16 23:58
 * @Version 1.0
 **/
public interface ApplicationContext extends ListableBeanFactory, HierarchicalBeanFactory, ResourceLoader, ApplicationEventPublisher {
}
