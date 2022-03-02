package com.task1.specification.impl;

import com.task1.entity.CustomArray;
import com.task1.specification.Specification;

import java.util.Arrays;

public class ArraySumSpecification implements Specification<CustomArray> {
    private int sum;

    public ArraySumSpecification(int sum){
        this.sum = sum;
    }

    @Override
    public boolean specify(CustomArray item) {
        boolean result = false;
        int[] array = item.getArray();
        int checkSum = Arrays.stream(array).sum();

        if(checkSum == sum){
            result = true;
        }

        return result;
    }
}
