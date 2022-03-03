package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.service.inter.ArrayManipulator;
import com.task1.service.impl.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.function.Predicate;

public class ArrayManipulatorImpl implements ArrayManipulator {
    private static final Logger LOGGER = LogManager.getLogger(ArrayManipulatorImpl.class);

    @Override
    public void changeElementByCondition(CustomArray entity, Predicate<Integer> predicate, int newValue) throws AppException {
        if (entity == null || predicate == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
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
