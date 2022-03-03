package com.task1.observer.impl;

import com.task1.entity.ArrayParameters;
import com.task1.entity.ArrayWarehouse;
import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.observer.ArrayEvent;
import com.task1.observer.ArrayObserver;
import com.task1.service.impl.ArrayManipulatorImpl;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArrayObserverImplTest {

    private ArrayEvent event;

    @BeforeTest
    public void setUp() throws AppException {
        CustomArray array = new CustomArray(1, 2, 3);
        event = new ArrayEvent(array);
        ArrayParameters parameters = new ArrayParameters();
        ArrayWarehouse.getInstance().put(array.getArrayId(), parameters);
        array.attach(new ArrayObserverImpl());
    }

    @Test
    public void testUpdateSum() throws AppException{
        event.getSource().setElement(0, 2);
        ArrayParameters parameters = ArrayWarehouse.getInstance().get(event.getSource().getArrayId());
        assertEquals(parameters.getSum(), 7);
    }

    @Test
    public void testUpdateMin() throws AppException{
        event.getSource().setElement(0, 0);
        ArrayParameters parameters = ArrayWarehouse.getInstance().get(event.getSource().getArrayId());
        assertEquals(parameters.getMin(), 0);
    }

    @Test
    public void testUpdateMax() throws AppException{
        event.getSource().setElement(0, 5);
        ArrayParameters parameters = ArrayWarehouse.getInstance().get(event.getSource().getArrayId());
        assertEquals(parameters.getMax(), 5);
    }
}