package com.task1.entity;

import com.task1.exception.AppException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class CustomArray {

    private int[] array;
    private static final Logger LOGGER = LogManager.getLogger(CustomArray.class);

    public CustomArray() {
    }

    public CustomArray(int... array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array) throws AppException {
        if (array == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }
        this.array = array;
    }

    public int getElement(int index) throws AppException {
        if (index < 0 || index >= array.length) {
            LOGGER.log(Level.ERROR, "Index out of range!");
            throw new AppException("Index out of range!");
        }

        return array[index];
    }

    public void setElement(int index, int element) throws AppException {
        if (index < 0 || index >= array.length) {
            LOGGER.log(Level.ERROR, "Index out of range!");
            throw new AppException("Index out of range!");
        }

        this.array[index] = element;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int a : array) {
            sb.append(a).append("");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CustomArray entity = (CustomArray) o;
        return Arrays.equals(array, entity.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }
}
