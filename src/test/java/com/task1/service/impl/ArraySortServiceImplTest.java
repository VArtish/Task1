package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ArraySortServiceImplTest {
    private ArraySortServiceImpl arraySort;
    private CustomArray entity;

    @BeforeTest
    public void setUp() {
        arraySort = new ArraySortServiceImpl();
        entity = new CustomArray(1, 5, 4, 2, 3);
    }

    @Test
    public void testBubbleSort() throws AppException {
        int[] expectedEntity = {1, 2, 3, 4, 5};

        arraySort.bubbleSort(entity);
        Assert.assertEquals(entity.getArray(), expectedEntity, "This result is not corrected for bubbleSort!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testBubbleSortExcept() throws AppException {
        arraySort.bubbleSort(null);
    }

    @Test
    public void testSelectionSort() throws AppException {
        int[] expectedEntity = {1, 2, 3, 4, 5};

        arraySort.selectionSort(entity);
        Assert.assertEquals(entity.getArray(), expectedEntity, "This result is not corrected for selectionSort!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testSelectionSortExcept() throws AppException {
        arraySort.selectionSort(null);
    }

    @Test
    public void testInsertionSort() throws AppException {
        int[] expectedEntity = {1, 2, 3, 4, 5};

        arraySort.insertionSort(entity);
        Assert.assertEquals(entity.getArray(), expectedEntity, "This result is not corrected for insertionSort!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testInsertionSortExcept() throws AppException {
        arraySort.insertionSort(null);
    }
}