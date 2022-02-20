package com.task1.service.inter;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;

import java.util.function.Predicate;

public interface ArrayManipulator {

    void changeElementByCondition(CustomArray entity, Predicate<Integer> predicate, int newValue) throws AppException;

}
