package com.task1.reader;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

import com.task1.exception.AppException;
import com.task1.validator.*;

public class ArrayReader {
    private static ArrayReader instance = null;

    private ArrayReader() {
    }

    public static ArrayReader getInstance() {
        if (instance == null) {
            instance = new ArrayReader();
        }

        return instance;
    }

    public String readFile(String path) throws AppException {

        if (path == null) {
            throw new AppException("Input file name cannot be null!");
        }

        if (path.length() == 0) {
            throw new AppException("Input file name cannot be empty!");
        }

        if (Files.notExists(Paths.get(path))) {
            throw new AppException("Input file not found!");
        }


        String rightLine = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get(path));

            for(String line : lines){
                if(ArrayValidator.getInstance().validateArrayString(line)){
                    rightLine = line;
                    break;
                }
            }

            if(rightLine == null){
                throw new AppException("No valid line in the fil!");
            }
        } catch (IOException e) {
            throw new AppException("Error while reading file!");
        }

        return rightLine;
    }

}
