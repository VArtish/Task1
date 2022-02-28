package com.task1.comparator;

import com.task1.entity.CustomArray;

import java.util.Comparator;

public class ArrayFirstElementComparator implements Comparator<CustomArray> {

    @Override
    public int compare(CustomArray o1, CustomArray o2) {
        int compare = Integer.compare(o1.getArray()[0], o2.getArray()[0]);
        return compare;
    }

}
