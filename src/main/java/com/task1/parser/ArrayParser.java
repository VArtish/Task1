package com.task1.parser;

import com.task1.entity.CustomArray;

import java.util.Arrays;

public class ArrayParser {
    private static ArrayParser instance = null;
    private static final String PATTERN = "[-,\\s]+";

    private ArrayParser(){
    }

    public static ArrayParser getInstance(){
        if(instance == null){
            instance = new ArrayParser();
        }

        return instance;
    }

    public int[] parse(String arrayLine){
        String[] numbers = arrayLine.split(PATTERN);
        int[] array = Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .toArray();

        return array;
    }
}
