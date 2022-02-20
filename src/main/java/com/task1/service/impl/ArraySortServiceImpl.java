package com.task1.service.impl;

import com.task1.exception.AppException;
import com.task1.service.inter.ArraySortService;
import com.task1.entity.CustomArray;

public class ArraySortServiceImpl implements ArraySortService {

    @Override
    public void bubbleSort(CustomArray entity) throws AppException {
        if (entity == null) {
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int supportElement;

        for (int i = 0; i < tempArray.length; i++) {
            for (int j = 0; j < tempArray.length - i; j++) {

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
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();

        for (int left = 0; left < tempArray.length; left++) {

            int value = tempArray[left];
            int i = left - 1;

            for (; i >= 0; i--) {

                if (value < tempArray[i]) {
                    tempArray[i + 1] = tempArray[i];
                } else {
                    break;
                }
            }
            tempArray[i + 1] = value;
        }

    }

}
