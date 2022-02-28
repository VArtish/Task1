package com.task1.observer.impl;

import com.task1.entity.ArrayParameters;
import com.task1.entity.ArrayWarehouse;
import com.task1.entity.CustomArray;
import com.task1.exception.AppException;
import com.task1.observer.ArrayEvent;
import com.task1.observer.ArrayObserver;
import com.task1.service.impl.ArrayCalculatorImpl;
import com.task1.service.impl.ArraySearcherImpl;

import java.util.Optional;

public class ArrayObserverImpl implements ArrayObserver {

    @Override
    public void updateSum(ArrayEvent event) {
        CustomArray element = event.getSource();
        ArrayParameters parameters = ArrayWarehouse.getInstance().get(element.getArrayId());
        ArrayCalculatorImpl arrayCalculator = new ArrayCalculatorImpl();
        int sum;

        try{
            sum = arrayCalculator.calculatingSum(element);
            parameters.setSum(sum);
        }
        catch(AppException e){
        }
    }

    @Override
    public void updateMin(ArrayEvent event) {
        CustomArray element = event.getSource();
        ArrayParameters parameters = ArrayWarehouse.getInstance().get(element.getArrayId());
        ArraySearcherImpl arraySearcher = new ArraySearcherImpl();
        int min;

        try{
            min = arraySearcher.findMin(element);
            parameters.setMin(min);
        }
        catch(AppException e){
        }
    }

    @Override
    public void updateMax(ArrayEvent event) {
        CustomArray element = event.getSource();
        ArrayParameters parameters = ArrayWarehouse.getInstance().get(element.getArrayId());
        ArraySearcherImpl arraySearcher = new ArraySearcherImpl();
        int max;

        try{
            max = arraySearcher.findMax(element);
            parameters.setMax(max);
        }
        catch(AppException e){
        }
    }
}
