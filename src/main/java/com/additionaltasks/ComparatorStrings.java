package com.additionaltasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparatorStrings {

    public boolean compareStrings(String a, String b){

        List<String> stringA = new ArrayList<>();
        List<String> stringB = new ArrayList<>();

        for (int i=0; i < a.length(); i++){

            stringA.add(a.substring(i,i+1));
        }

        for (int i=0; i < b.length(); i++){

            stringB.add(b.substring(i,i+1));
        }

        Collections.sort(stringA);

        System.out.println("------------------");
        String stringASort = "";
        for (String aList: stringA){
            stringASort = stringASort + aList;
        }
        System.out.println("Given " + a + " Sorted " + stringASort);

        Collections.sort(stringB);

        System.out.println("------------------");
        String stringBSort = "";
        for (String bList: stringB){
            stringBSort = stringBSort + bList;
        }
        System.out.println("Given " + b + " Sorted " + stringBSort);

        return stringASort.equals(stringBSort);
    }

}
