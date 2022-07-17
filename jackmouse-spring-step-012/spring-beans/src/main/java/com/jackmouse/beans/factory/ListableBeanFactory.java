package com.jackmouse.beans.factory;

import com.jackmouse.beans.BeansException;
import com.jackmouse.beans.factory.BeanFactory;

import java.util.Map;

/**
 * @ClassName ListableBeanFactory
 * @Description 枚举工厂所有 bean 实例
 * @Author zhoujiaangyao
 * @Date 2022/6/16 18:42
 * @Version 1.0
 **/
public interface ListableBeanFactory extends BeanFactory {
    /**
     * 按照类型返回 Bean 实例
     * @param type
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> Map<String, T> getBeansOfType(Class<T> type) throws BeansException;

    /**
     * 返回注册表中所有的Bean名称
     * @return
     */
    String[] getBeanDefinitionNames();
}
