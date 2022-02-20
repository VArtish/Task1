package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySearcherImplTest {

    private ArraySearcherImpl arraySearcher;
    private CustomArray entity;

    @BeforeTest
    public void setUp(){
        arraySearcher = new ArraySearcherImpl();
        entity = new CustomArray(1, 2, 3);
    }

    @Test
    public void testFindMin() {
        double expectedResult = 1;
        double actualResult = -1;

        try {
            actualResult = arraySearcher.findMin(entity);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for findMin!");

    }

    @Test
    public void testFindMax() {
        double expectedResult = 3;
        double actualResult = -1;

        try {
            actualResult = arraySearcher.findMax(entity);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(actualResult, expectedResult, "This result is not corrected for findMax!");
    }
}