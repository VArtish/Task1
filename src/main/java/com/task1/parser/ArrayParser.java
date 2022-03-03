package com.task1.parser;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayParser {

    private static ArrayParser INSTANCE= null;
    private static final String PATTERN = "[-,\\s]+";
    private static final Logger LOGGER = LogManager.getLogger(ArrayParser.class);

    private ArrayParser() {
    }

    public static ArrayParser getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ArrayParser();
        }

        return INSTANCE;
    }

    public int[] parse(String arrayLine) throws AppException {
        if (arrayLine == null || arrayLine.isEmpty()) {
            LOGGER.log(Level.ERROR, "Line is empty!");
            throw new AppException("Line is empty!");
        }

        String[] numbers = arrayLine.split(PATTERN);
        return Arrays.stream(numbers)
                .mapToInt(Integer::parseInt)
                .toArray();
    }
}
