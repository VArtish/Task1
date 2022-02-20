package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.service.inter.ArrayCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Level;

public class ArrayCalculatorImpl implements ArrayCalculator {

    private static final Logger LOGGER = LogManager.getLogger(ArrayCalculatorImpl.class);

    @Override
    public int calculatingSum(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int sum = 0;
        for (int i = 0; i < tempArray.length; i++) {
            sum += tempArray[i];
        }

        return sum;
    }

    @Override
    public double calculatingAverage(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        return calculatingSum(entity) / entity.getArray().length;
    }

    @Override
    public int negativeNumbersInArray(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int counter = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < 0) {
                counter++;
            }
        }

        return counter;
    }

    @Override
    public int positiveNumbersInArray(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int counter = 0;
        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] >= 0) {
                counter++;
            }
        }

        return counter;
    }
}
