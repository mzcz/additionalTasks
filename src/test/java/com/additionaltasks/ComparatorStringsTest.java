package com.additionaltasks;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ComparatorStringsTest {
public static int i=0;

@Before
public void test(){
    i++;
    System.out.println("#Test number " + i);
}

    @Test
    public void compareStringFirstCase(){
        //Given
        ComparatorStrings ComparatorStrings = new ComparatorStrings();

        //When
        boolean compareTrue = ComparatorStrings.compareStrings("abdd", "bdad");

        //Then
        Assert.assertEquals(true, compareTrue);
    }

    @Test
    public void compareStringSecondCase(){
        //Given
        ComparatorStrings ComparatorStrings = new ComparatorStrings();

        //When
        boolean compareTrue = ComparatorStrings.compareStrings("abdd", "addb");

        //Then
        Assert.assertEquals(true, compareTrue);
    }

    @Test
    public void compareStringThirdCase(){
        //Given
        ComparatorStrings ComparatorStrings = new ComparatorStrings();

        //When
        boolean compareTrue = ComparatorStrings.compareStrings("bdada", "addba");

        //Then
        Assert.assertEquals(true, compareTrue);
    }

    @Test
    public void compareStringFourthCase(){
        //Given
        ComparatorStrings ComparatorStrings = new ComparatorStrings();

        //When
        boolean compareFalse = ComparatorStrings.compareStrings("abdd", "adbb");

        //Then
        Assert.assertEquals(false, compareFalse);
    }
}
