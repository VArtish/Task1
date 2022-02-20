package com.task1.service.inter;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;

public interface ArraySortService {

    void bubbleSort(CustomArray entity) throws AppException;

    void selectionSort(CustomArray entity) throws AppException;

    void insertionSort(CustomArray entity) throws AppException;

}
