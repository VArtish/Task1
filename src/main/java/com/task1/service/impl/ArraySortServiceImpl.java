package com.task1.service.impl;

import com.task1.exception.AppException;
import com.task1.service.inter.ArraySortService;
import com.task1.entity.CustomArray;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySortServiceImpl implements ArraySortService {

    private static final Logger LOGGER = LogManager.getLogger(ArraySortServiceImpl.class);

    @Override
    public void bubbleSort(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int supportElement;

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray.length - i - 1; j++) {
                if (tempArray[j + 1] < tempArray[j]) {
                    supportElement = tempArray[j + 1];
                    tempArray[j + 1] = tempArray[j];
                    tempArray[j] = supportElement;
                }

            }
        }
        entity.setArray(tempArray);
    }

    @Override
    public void selectionSort(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int supportElement;

        for (int i = 0; i < tempArray.length; i++) {

            int checkedElement = tempArray[i];
            int indexCheckedElement = i;

            for (int j = i; j < tempArray.length; j++) {

                if (tempArray[j] < checkedElement) {
                    indexCheckedElement = j;
                    checkedElement = tempArray[j];
                }
            }

            supportElement = tempArray[i];
            tempArray[i] = checkedElement;
            tempArray[indexCheckedElement] = supportElement;
        }
        entity.setArray(tempArray);
    }

    @Override
    public void insertionSort(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] array = entity.getArray();

        for (int left = 0; left < array.length; left++) {
            int value = array[left];
            int i = left - 1;

            for (; i >= 0; i--) {
                if (value < array[i]) {
                    array[i + 1] = array[i];
                } else {
                    break;
                }
            }

            array[i + 1] = value;
        }

        entity.setArray(array);
    }
}
