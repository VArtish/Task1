package com.task1.comparator;

import com.task1.entity.CustomArray;

import java.util.Comparator;

public class ArrayLenghtIdComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int compare = Integer.compare(o1.getArrayId().length(), o2.getArrayId().length());
        return compare;
    }
}
