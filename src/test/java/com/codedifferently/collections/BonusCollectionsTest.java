package com.codedifferently.collections;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BonusCollectionsTest {


    @Test
    public void isEmptyTest(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add("aa");
        newArrayList.add("bb");
        newArrayList.add("cc");
        Assert.assertTrue(newArrayList.isEmpty());
    }

    @Test
    public void sizeTest(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add("aa");
        newArrayList.add("bb");
        newArrayList.add("cc");
        int actual = 3;
        int expected =  newArrayList.size();
        Assert.assertEquals(actual, expected);

    }

    @Test
    public void removeTest(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add("aa");
        newArrayList.add("bb");
        newArrayList.add("cc");
        newArrayList.remove(2);
        String expected = "bb";
        String actual = newArrayList.get(2);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void clearTest(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add("aa");
        newArrayList.add("bb");
        newArrayList.add("cc");
        int expected = 0;
        int actual = newArrayList.size();
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void toArrayTest(){
        ArrayList<String> newArrayList = new ArrayList<String>();
        newArrayList.add("aa");
        newArrayList.add("bb");
        newArrayList.add("cc");
        int[] arr = new int[]{1, 2, 3};
        int[] expected = arr;
        //int[] actual = newArrayList.toArray();

    }
}
