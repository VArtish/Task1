package com.task1.repository;

import com.task1.exception.AppException;
import com.task1.specification.Specification;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public interface Repository<T> {

    void add(T item);

    boolean remove(T item);

    boolean removeAll(Collection<T> items);

    void sort(Comparator<? super T> comparator);

    T get(int index) throws AppException;

    List<T> findAll();

    List<T> query(Specification specification);

}
