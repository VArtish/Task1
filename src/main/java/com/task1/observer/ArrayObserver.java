package com.task1.observer;

public interface ArrayObserver extends Observer{

    void updateSum(ArrayEvent event);

    void updateMin(ArrayEvent event);

    void updateMax(ArrayEvent event);

}
