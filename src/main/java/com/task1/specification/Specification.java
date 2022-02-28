package com.task1.specification;

public interface Specification<T> {
    boolean specify(T item);
}
