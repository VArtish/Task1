package com.task1.service.impl;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.service.inter.ArraySearcher;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArraySearcherImpl implements ArraySearcher {

    private static final Logger LOGGER = LogManager.getLogger(ArraySearcherImpl.class);

    @Override
    public int findMin(CustomArray entity) throws AppException {
        if (entity == null) {
            LOGGER.log(Level.ERROR, "Null pointer!");
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int min = tempArray[0];

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] < min) {
                min = tempArray[i];
            }
        }

        return min;
    }

    @Override
    public int findMax(CustomArray entity) throws AppException {
        if (entity == null) {
            throw new AppException("Null pointer!");
        }

        int[] tempArray = entity.getArray();
        int max = tempArray[0];

        for (int i = 0; i < tempArray.length; i++) {
            if (tempArray[i] > max) {
                max = tempArray[i];
            }
        }

        return max;
    }

}
