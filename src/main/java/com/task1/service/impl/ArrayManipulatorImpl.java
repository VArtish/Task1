package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.service.inter.ArrayManipulator;
import com.task1.service.impl.*;

import java.util.function.Predicate;

public class ArrayManipulatorImpl implements ArrayManipulator{

    @Override
    public void changeElementByCondition(CustomArray entity, Predicate<Integer> predicate, int newValue) throws AppException {
        if (entity == null || predicate == null) {
            throw new AppException("Null pointer!");
        }
        int[] tempArray = entity.getArray();

        for(int i = 0; i < tempArray.length; i++){
            if(predicate.test(tempArray[i])){
                tempArray[i] = newValue;
            }
        }

        entity.setArray(tempArray);
    }
}
