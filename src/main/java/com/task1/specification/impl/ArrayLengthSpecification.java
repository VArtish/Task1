package com.task1.specification.impl;

import com.task1.entity.CustomArray;
import com.task1.specification.Specification;

public class ArrayLengthSpecification implements Specification<CustomArray> {
    private int length;

    public ArrayLengthSpecification(int length){
        this.length = length;
    }

    @Override
    public boolean specify(CustomArray item) {
        boolean result = false;

        if(item.getArray().length == length){
            result = true;
        }
        return result;
    }
}