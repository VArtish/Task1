package com.task1.specification.impl;

import com.task1.entity.CustomArray;
import com.task1.specification.Specification;

public class ArrayValueSpecification implements Specification<CustomArray> {
    private int value;

    public ArrayValueSpecification(int value){
        this.value = value;
    }

    @Override
    public boolean specify(CustomArray item) {
        int[] array = item.getArray();
        boolean result = false;

        for(int i = 0; i < array.length; i++){
            if(array[i] == value){
                result = true;
                break;
            }
        }

        return result;
    }
}