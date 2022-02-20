package com.task1.entity;

import com.task1.exception.AppException;

import java.util.Arrays;

public class CustomArray {
    private int[] array;

    public CustomArray() {
    }

    public CustomArray(int... array){
        this.array = array;
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array){
        this.array = array;
    }

    public int getElement(int index) throws AppException {
        if (index < 0 || index >= array.length) {
            throw new AppException("Index out of range!");
        }

        return array[index];
    }

    public void setElement(int index, int element) throws AppException {
        if (index < 0 || index >= array.length) {
            throw new AppException("Index out of range!");
        }

        this.array[index] = element;
    }
}
