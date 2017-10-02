package com.additionaltasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Vector;

public class M3_D6_cricle {

    /*
    - Napisz klasę Circle –okrąg powinien mieć jakieś atrubuty, co najmniej promień.
- Stwórz kolekcję do której wstawiaj Okręgi z przypadkowymi (randomowymi,
wylosowanymi) promieniami, aż do momentu, aż wylosowany promień dla kolejnego okręgu
będzie mniejszy od 0.01.Po wstawieniu elementów do kolekcji wydrukuj pole każdego
okręgu z kolekcji.
Wykonaj zadanie dla kolekcji: ArrayList oraz Vector mierząc czasy.
     */
    public static void main(String[] args){
        //ArrayList
        List<Circle> circleList = new ArrayList<>();

        double radius = new Random().nextDouble();


        long begin = System.currentTimeMillis();

        while(radius >0.01) {

            circleList.add(new Circle(radius));
            radius = new Random().nextDouble();
        }

        long end = System.currentTimeMillis();


        System.out.println("Print");
        for (Circle surfaceAreaArrayList:  circleList){
            System.out.println("SurfaceArea with ArrayList " + surfaceAreaArrayList.getSurfaceArea());
        }

        System.out.println("Adding element at the beginning of the Array collection has taken: " + (end - begin) + "ms");

        //Vector
        Vector<Circle> circleVector = new Vector<>();

         radius = new Random().nextDouble();

         begin = System.currentTimeMillis();

        while(radius >0.01) {

            circleVector.add(new Circle(radius));
            radius = new Random().nextDouble();
        }

         end = System.currentTimeMillis();


        System.out.println("Print");
        for (Circle surfaceVectorList:  circleVector){
            System.out.println("SurfaceArea with Vector" + surfaceVectorList.getSurfaceArea());
        }

        System.out.println("Adding element at the beginning of the Vector collection has taken: " + (end - begin) + "ms");

    }
}
