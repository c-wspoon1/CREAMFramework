package com.codedifferently.collections;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class BonusCollections<T> {
    private T[] tArray = new T[10];
    private int collectionsCounter = tArray.length;

    public Boolean isEmpty(){
        if(collectionsCounter == 0) {
            return true;
        }else{
                return false;
            }
        }

    public Integer size(){
        for(T t:tArray){
            collectionsCounter++;
        }
        return collectionsCounter;
    }

    public void Remove(int elementIndex){
        tArray[elementIndex] = null;
//        if (elementIndex.equals(null)) {
//            return true;
//        }else{
//            return false;
//        }
    }

    public void clear(){
        tArray = null;

    }

    public Object[] toArray(){
       // ArrayList newArrayList = new ArrayList(tArray);
        return Arrays.stream(tArray).toArray();
    }
}
