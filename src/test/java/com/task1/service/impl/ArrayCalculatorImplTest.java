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
    public void init(){
        arrayCalculator = new ArrayCalculatorImpl();
        entity = new CustomArray(1, 2, 3);
    }

    @Test(description = "check calculating function")
    public void testCalculatingSum(){
        double expectedResult = 6;
        double actualResult = -1;

        try {
            actualResult = arrayCalculator.calculatingAverage(entity);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating average!");
    }

    @Test(description = "check calculating average function")
    public void testCalculatingAverage() {
        double expectedResult = 2;
        double actualResult = -1;

        try {
            actualResult = arrayCalculator.calculatingAverage(entity);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating average!");
    }

    @Test(description = "check function - negativeNumbersInArray")
    public void testNegativeNumbersInArray() {
        double expectedResult = 0;
        double actualResult = -1;

        try {
            actualResult = arrayCalculator.negativeNumbersInArray(entity);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating negative numbers!");
    }

    @Test(description = "check function - positiveNumbersInArray")
    public void testPositiveNumbersInArray() {
        double expectedResult = 3;
        double actualResult = -1;

        try {
            actualResult = arrayCalculator.positiveNumbersInArray(entity);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for calculating positive numbers!");
    }
}