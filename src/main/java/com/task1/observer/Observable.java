package com.task1.observer;

public interface Observable {

    void attach(ArrayObserver observer);

    void detach(ArrayObserver observer);

    void notifyObservers();
}
