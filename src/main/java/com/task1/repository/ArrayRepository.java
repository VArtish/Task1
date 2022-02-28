package com.task1.repository;

import com.task1.entity.CustomArray;
import com.task1.exception.AppException;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class ArrayRepository implements Repository<CustomArray> {

    private List<CustomArray> items;
    private static ArrayRepository INSTANCE = null;

    public ArrayRepository(){
        items = new ArrayList<CustomArray>();
    }

    public ArrayRepository(List<CustomArray> items) {
        this.items = items;
    }


    public static ArrayRepository getInstance() {
        if(INSTANCE == null){
            INSTANCE = new ArrayRepository();
        }

        return INSTANCE;
    }

    @Override
    public void add(CustomArray item) {
        items.add(item);
    }

    @Override
    public void addAll(Collection<CustomArray> items) {
        items.addAll(items);
    }

    @Override
    public boolean remove(CustomArray item) {
       return items.remove(item);
    }

    @Override
    public boolean removeAll(Collection<CustomArray> items) {
        return items.removeAll(items);
    }

    @Override
    public void sort(Comparator<? super CustomArray> comparator) {
        items.sort(comparator);
    }

    @Override
    public CustomArray get(int index) throws AppException{
        if(index > items.size()){
            throw new AppException("Index out of range!");
        }

        return items.get(index);
    }

    @Override
    public List<CustomArray> getAll() {
        return List.copyOf(items);
    }

    @Override
    public void set(int index, CustomArray item){
        items.set(index, item);
    }
}
