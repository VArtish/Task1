package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.service.inter.ArrayCalculator;

public class ArrayCalculatorImpl implements ArrayCalculator {

    @Override
    public int calculatingSum(CustomArray entity) throws AppException {
        if (entity == null) {
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
            throw new AppException("Null pointer!");
        }

        return calculatingSum(entity) / entity.getArray().length;
    }

    @Override
    public int negativeNumbersInArray(CustomArray entity) throws AppException {
        if (entity == null) {
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
