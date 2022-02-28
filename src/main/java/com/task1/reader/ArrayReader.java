package com.task1.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.task1.exception.AppException;
import com.task1.validator.*;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ArrayReader {

    private static ArrayReader INSTANCE = null;
    private static final Logger LOGGER = LogManager.getLogger(ArrayReader.class);

    private ArrayReader() {
    }

    public static ArrayReader getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new ArrayReader();
        }

        return INSTANCE;
    }

    public String readFile(String path) throws AppException {

        if (path == null) {
            LOGGER.log(Level.ERROR, "Input file name cannot be null!");
            throw new AppException("Input file name cannot be null!");
        }

        if (path.length() == 0) {
            LOGGER.log(Level.ERROR, "Input file name cannot be empty!");
            throw new AppException("Input file name cannot be empty!");
        }

        if (Files.notExists(Paths.get(path))) {
            LOGGER.log(Level.ERROR, "Input file not found!");
            throw new AppException("Input file not found!");
        }


        String rightLine = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));

            for (String line : lines) {
                if (ArrayValidator.getInstance().validateArrayString(line)) {
                    rightLine = line;
                    break;
                }
            }

            if (rightLine == null) {
                LOGGER.log(Level.ERROR, "No valid line in the file!");
                throw new AppException("No valid line in the file!");
            }
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "Error while reading file!");
            throw new AppException("Error while reading file!");
        }

        return rightLine;
    }

}
