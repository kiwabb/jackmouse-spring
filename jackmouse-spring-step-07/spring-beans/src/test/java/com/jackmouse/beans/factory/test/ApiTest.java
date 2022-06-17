package com.jackmouse.beans.factory.test;

import cn.hutool.core.io.IoUtil;
import com.jackmouse.beans.PropertyValue;
import com.jackmouse.beans.PropertyValues;
import com.jackmouse.beans.factory.config.BeanReference;
import com.jackmouse.beans.factory.support.DefaultListableBeanFactory;
import com.jackmouse.beans.factory.test.bean.UserDao;
import com.jackmouse.beans.factory.test.bean.UserService;
import com.jackmouse.beans.factory.config.BeanDefinition;
import com.jackmouse.beans.factory.xml.XmlBeanDefinitionReader;
import com.jackmouse.core.io.DefaultResourceLoader;
import com.jackmouse.core.io.Resource;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName ApiTest
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/14 23:09
 * @Version 1.0
 **/
public class ApiTest {
    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_classpath() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
    @Test
    public void test_file() throws IOException {
        Resource resource = resourceLoader.getResource("src/test/resources/important.properties");
        InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }
    @Test
    public void test_url() throws IOException {
        Resource resource = resourceLoader.getResource("https://github.com/fuzhengwei/small-spring/blob/main/important.properties");
                InputStream inputStream = resource.getInputStream();
        String content = IoUtil.readUtf8(inputStream);
        System.out.println(content);
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 读取配置文件&注册Bean
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions("classpath:spring.xml");

        // 3. 获取Bean对象调用方法
        UserService userService = beanFactory.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }
}
