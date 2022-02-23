package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.function.Predicate;

public class ArrayManipulatorImplTest {

    private ArrayManipulatorImpl arrayManipulator;
    private CustomArray entity;

    @BeforeTest
    public void setUp() {
        arrayManipulator = new ArrayManipulatorImpl();
        entity = new CustomArray(1, 2, 3);
    }

    @Test(description = "check function - changeElementByCondition")
    public void testChangeElementByCondition() throws AppException {
        int[] expectedArray = {1, 0, 0};

        arrayManipulator.changeElementByCondition(entity, x -> (x > 1), 0);
        Assert.assertEquals(entity.getArray(), expectedArray, "This result is not corrected for changeElementByCondition!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testCalculatingAverageExcept() throws AppException {
        arrayManipulator.changeElementByCondition(null, x -> (x > 1), 3);
    }
}