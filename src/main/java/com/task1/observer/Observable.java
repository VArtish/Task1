package com.task1.observer;

import com.task1.exception.AppException;

public interface Observable {

    void attach(ArrayObserver observer);

    void detach(ArrayObserver observer);

    void notifyObservers();
}
