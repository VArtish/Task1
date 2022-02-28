package com.task1.entity;

import com.task1.exception.AppException;
import com.task1.observer.ArrayEvent;
import com.task1.observer.ArrayObserver;
import com.task1.observer.Observable;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;

public class CustomArray implements Observable {

    private int[] array;
    private String arrayId;
    private static final Logger LOGGER = LogManager.getLogger(CustomArray.class);
    private List<ArrayObserver> observers = new ArrayList<>();

    public CustomArray() {
        this.arrayId = UUID.randomUUID().toString();
    }

    public CustomArray(int... array) {
        this.arrayId = UUID.randomUUID().toString();
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
        notifyObservers();
    }

    public int getElement(int index) throws AppException {
        if (index < 0 || index >= array.length) {
            LOGGER.log(Level.ERROR, "Index out of range!");
            throw new AppException("Index out of range!");
        }

        return array[index];
    }

    public String getArrayId() {
        return this.arrayId;
    }

    public void setElement(int index, int element) throws AppException {
        if (index < 0 || index >= array.length) {
            LOGGER.log(Level.ERROR, "Index out of range!");
            throw new AppException("Index out of range!");
        }

        this.array[index] = element;
        notifyObservers();
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        for (int a : array) {
            sb.append(a).append(" ");
        }
        sb.append(arrayId).append("");

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

    @Override
    public void attach(ArrayObserver observer){
        if(!(observer == null)){
            observers.add(observer);
        }
    }

    @Override
    public void detach(ArrayObserver observer){
        if(!(observer == null) && observers.contains(observer)) {
            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers(){
        ArrayEvent event = new ArrayEvent(this);

        if(!observers.isEmpty()) {
            for (ArrayObserver o : observers) {
                o.updateMax(event);
                o.updateMin(event);
                o.updateSum(event);
            }
        }
    }
}
