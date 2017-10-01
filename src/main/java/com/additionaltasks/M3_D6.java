package com.additionaltasks;

import java.util.*;

public class M3_D6 {
    public static void main(String[] args){

        //2
        Map<Student, Double> studentMap = new HashMap<>();

        List<Student> student = new ArrayList<>(Arrays.asList(
                new Student(90120522346L,"Kacper","Nowak","blue")
                ,new Student(90121522348L,"Jan","Kowalski","brown")
                ,new Student(90122522349L,"Piotr","Majewski","green")
                ,new Student(90122522347L,"Angelina","Wojciechowska","blue")
                ,new Student(90122522347L,"Angela","Wojciechowski","hazel brown")));

        //3
        for (int i = 0; i < student.size(); i++) {
            Student myStudent = student.get(i);

            double n = 0.0;
            while (n <= 1) {
                Random randomGenerator = new Random();
                n = randomGenerator.nextInt(6);
            }
            studentMap.put(myStudent, n);
            System.out.println("myStudent.hashCode "+ myStudent.hashCode());
        }


        for(Map.Entry<Student, Double> entry :studentMap.entrySet()){
            System.out.println("Object: <" + entry.getKey() + ", " + entry.getValue() + ">");
        }

        System.out.println("Size studentMap : "+ studentMap.size() + " Size student: " + student.size());

        // Before removing equals and hashcode
        // Size studentMap : 4 Size student: 5

        //4
        // After removing equals and hashcode
        //Size studentMap : 5 Size student: 5
    }
}