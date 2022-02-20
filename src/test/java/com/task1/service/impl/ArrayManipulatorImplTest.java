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
    public void init(){
        arrayManipulator = new ArrayManipulatorImpl();
        entity = new CustomArray(1, 2, 3);
    }

    @Test(description = "check function - changeElementByCondition")
    public void testChangeElementByCondition() {
        CustomArray expectedEntity = new CustomArray(1, 0, 0);
        int changeValue = 0;


        try {
            arrayManipulator.changeElementByCondition(entity, x -> (x > 1), changeValue);
        }
        catch(AppException e){
            System.out.println(e.getMessage());
        }

        Assert.assertEquals(entity.getArray(), expectedEntity.getArray(), "This result is not corrected for changeElementByCondition!");
    }
}