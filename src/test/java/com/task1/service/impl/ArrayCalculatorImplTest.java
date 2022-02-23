package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ArrayCalculatorImplTest {

    private ArrayCalculatorImpl arrayCalculator;
    private CustomArray entity;

    @BeforeTest
    public void setUp() {
        arrayCalculator = new ArrayCalculatorImpl();
        entity = new CustomArray(1, 2, 3);
    }

    @Test(description = "check calculating function")
    public void testCalculatingSum() throws AppException {
        double expectedResult = 6;
        double actualResult = -1;

        actualResult = arrayCalculator.calculatingSum(entity);
        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating average!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testCalculatingSumExcept() throws AppException {
        arrayCalculator.calculatingSum(null);
    }


    @Test(description = "check calculating average function")
    public void testCalculatingAverage() throws AppException {
        double expectedResult = 2;
        double actualResult = -1;

        actualResult = arrayCalculator.calculatingAverage(entity);
        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating average!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testCalculatingAverageExcept() throws AppException {
        arrayCalculator.calculatingAverage(null);
    }

    @Test(description = "check function - negativeNumbersInArray")
    public void testNegativeNumbersInArray() throws AppException {
        double expectedResult = 0;
        double actualResult = -1;

        actualResult = arrayCalculator.negativeNumbersInArray(entity);
        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating negative numbers!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testNegativeNumbersInArrayExcept() throws AppException {
        arrayCalculator.negativeNumbersInArray(null);
    }

    @Test(description = "check function - positiveNumbersInArray")
    public void testPositiveNumbersInArray() throws AppException {
        double expectedResult = 3;
        double actualResult = -1;

        actualResult = arrayCalculator.positiveNumbersInArray(entity);
        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating positive numbers!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testPositiveNumbersInArrayExcept() throws AppException {
        arrayCalculator.positiveNumbersInArray(null);
    }
}