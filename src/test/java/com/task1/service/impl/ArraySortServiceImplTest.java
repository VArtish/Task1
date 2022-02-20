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
    public void testBubbleSort() {
        int[] expectedEntity = {1, 2, 3, 4, 5};

        try {
            arraySort.bubbleSort(entity);
        } catch (AppException e) {
        }

        Assert.assertEquals(entity.getArray(), expectedEntity, "This result is not corrected for bubbleSort!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testBubbleSortExcept() throws AppException {
        arraySort.bubbleSort(null);
    }

    @Test
    public void testSelectionSort() {
        int[] expectedEntity = {1, 2, 3, 4, 5};

        try {
            arraySort.selectionSort(entity);
        } catch (AppException e) {
        }

        Assert.assertEquals(entity.getArray(), expectedEntity, "This result is not corrected for selectionSort!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testSelectionSortExcept() throws AppException {
        arraySort.selectionSort(null);
    }

    @Test
    public void testInsertionSort() {
        int[] expectedEntity = {1, 2, 3, 4, 5};

        try {
            arraySort.insertionSort(entity);
        } catch (AppException e) {
        }

        Assert.assertEquals(entity.getArray(), expectedEntity, "This result is not corrected for insertionSort!");
    }

    @Test(expectedExceptions = AppException.class)
    public void testInsertionSortExcept() throws AppException {
        arraySort.insertionSort(null);
    }
}