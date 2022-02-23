package com.task1.exception;

public class AppException extends Exception {

    public AppException() {
    }

    public AppException(String message) {
        super(message);
    }

    public AppException(Throwable throwable) {
        super(throwable);
    }
}
