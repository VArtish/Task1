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
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        ArrayParameters entity = (ArrayParameters) o;
        if(getMax() != entity.getMax()){
            return false;
        }

        if(getMin() != entity.getMin()){
            return false;
        }

        if(getSum() != entity.getSum()){
            return false;
        }

        return true;
    }

    @Override
    public int hashCode() {
        return -1;
    }
}
