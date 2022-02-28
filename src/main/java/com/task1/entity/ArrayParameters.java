package com.task1.entity;

import java.util.Arrays;

public class ArrayParameters {
    private int sum;
    private int min;
    private int max;

    public ArrayParameters() {
    }

    public int getMax() {
        return max;
    }

    public int getMin() {
        return min;
    }

    public int getSum() {
        return sum;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder();
        sb.append("min = ").append(min);
        sb.append(" max = ").append(max);
        sb.append(" sum = ").append(sum);

        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        // определить
        return true;
    }

    @Override
    public int hashCode() {
        // определить
        return -1;
    }
}
