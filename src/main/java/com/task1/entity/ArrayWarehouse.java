package com.task1.entity;

import com.task1.exception.AppException;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class ArrayWarehouse {

    private final static Logger LOGGER = LogManager.getLogger(ArrayWarehouse.class);
    private static ArrayWarehouse INSTANCE = null;
    private Map<String, ArrayParameters> arrayMap = new HashMap<String, ArrayParameters>();

    private ArrayWarehouse(){
    }

    public static ArrayWarehouse getInstance(){
        if(INSTANCE == null){
            INSTANCE = new ArrayWarehouse();
        }

        return INSTANCE;
    }

    public void put(String arrayId, ArrayParameters element) throws AppException{
        if(element == null || arrayId == ""){
            LOGGER.log(Level.ERROR, "Null pointer" + arrayId);
            throw new AppException("Null pointer!");
        }

        arrayMap.put(arrayId, element);
    }

    public ArrayParameters remove(String arrayId){
        ArrayParameters element = arrayMap.remove(arrayId);
        return element;
    }

    public ArrayParameters get(String arrayId){
       ArrayParameters element = arrayMap.get(arrayId);

       return element;
    }
}
