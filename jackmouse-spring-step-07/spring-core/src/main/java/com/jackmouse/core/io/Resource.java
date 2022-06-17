package com.jackmouse.core.io;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName Resource
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/16 13:36
 * @Version 1.0
 **/
public interface Resource {
    /**
     * 资源加载接口
     * @return
     * @throws IOException
     */
    InputStream getInputStream() throws IOException;
}
