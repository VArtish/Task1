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

    @Override
    public String toString(){

        StringBuilder sb = new StringBuilder();
        for(int a: array){
            sb.append(a).append("");
        }

        return sb.toString();
    }

    @Override
    public boolean equals(Object o){
        if(this == o){
            return true;
        }

        if(o == null || getClass() != o.getClass()){
            return false;
        }

        CustomArray entity = (CustomArray)o;
        return Arrays.equals(array, entity.array);
    }

    @Override
    public int hashCode(){
        return Arrays.hashCode(array);
    }
}
