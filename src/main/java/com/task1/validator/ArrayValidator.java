package com.task1.validator;

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
        return line.matches(PATTERN);
    }
}
