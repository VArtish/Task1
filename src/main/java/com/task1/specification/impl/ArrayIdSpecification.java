package com.task1.specification.impl;

import com.task1.entity.CustomArray;
import com.task1.specification.Specification;

public class ArrayIdSpecification implements Specification<CustomArray> {
    private String id;

    public ArrayIdSpecification(String id){
        this.id = id;
    }
    @Override
    public boolean specify(CustomArray item) {
        boolean result = item.getArrayId().equals(id);
        return result;
    }
}
