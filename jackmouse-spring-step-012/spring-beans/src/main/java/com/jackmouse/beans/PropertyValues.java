package com.jackmouse.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName PropertyValues
 * @Description
 * @Author zhoujiaangyao
 * @Date 2022/6/15 23:09
 * @Version 1.0
 **/
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();
    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }
    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
