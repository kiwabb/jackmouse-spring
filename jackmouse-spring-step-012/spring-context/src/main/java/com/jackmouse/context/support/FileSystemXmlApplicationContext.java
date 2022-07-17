package com.jackmouse.context.support;

import com.jackmouse.core.io.FileSystemResource;
import com.jackmouse.core.io.Resource;

/**
 * @ClassName FileSystemXmlApplicationContext
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/7/17 17:03
 * @Version 1.0
 **/
public class FileSystemXmlApplicationContext extends AbstractXmlApplicationContext{
    public FileSystemXmlApplicationContext() {
    }
    /**
     * Resolve resource paths as file system paths.
     * <p>Note: Even if a given path starts with a slash, it will get
     * interpreted as relative to the current VM working directory.
     * This is consistent with the semantics in a Servlet container.
     * @param path the path to the resource
     * @return the Resource handle
     * @see org.springframework.web.context.support.XmlWebApplicationContext#getResourceByPath
     */
    protected Resource getResourceByPath(String path) {
        if (path.startsWith("/")) {
            path = path.substring(1);
        }
        return new FileSystemResource(path);
    }

    @Override
    protected String[] getConfigLocations() {
        return new String[0];
    }
}
