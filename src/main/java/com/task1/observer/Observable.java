package com.task1.observer;

import com.task1.exception.AppException;

public interface Observable {

    void attach(ArrayObserver observer) throws AppException;

    void detach(ArrayObserver observer) throws AppException;

    void notifyObservers();
}
