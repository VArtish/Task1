package com.task1.service.inter;

import com.task1.entity.CustomArray;
import com.task1.exception.*;


public interface ArrayCalculator {

    int calculatingSum(CustomArray entity) throws AppException;

    double calculatingAverage(CustomArray entity) throws AppException;

    int negativeNumbersInArray(CustomArray entity) throws AppException;

    int positiveNumbersInArray(CustomArray entity) throws AppException;
}
