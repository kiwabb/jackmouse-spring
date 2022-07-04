package com.jackmouse.beans;

/**
 * @ClassName PropertyValue
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 23:05
 * @Version 1.0
 **/
public class PropertyValue {
    private final String name;

    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public Object getValue() {
        return value;
    }
}
