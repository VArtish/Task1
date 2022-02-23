package com.task1.validator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayValidator {
    private static final String PATTERN = "^\\d+([-,\\s]{1}\\d+)*$";
    public static ArrayValidator instance = null;

    private ArrayValidator() {
    }

    public static ArrayValidator getInstance() {
        if (instance == null) {
            instance = new ArrayValidator();
        }

        return instance;
    }

    public boolean validateArrayString(String line) {
        if (line == null || line.isEmpty()) {
            return false;
        }

        return line.matches(PATTERN);
    }
}
