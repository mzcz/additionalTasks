package com.additionaltasks;

public class Person {

    private long pesel;
    private String name;
    private String lastName;

    public Person (){
    }

    public Person (long pesel, String name, String lastName){
        this.pesel = pesel;
        this.name = name;
        this.lastName = lastName;
    }

    public long getPesel() {
        return pesel;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        return pesel == person.pesel;
    }

    @Override
    public int hashCode() {
        return (int) (pesel ^ (pesel >>> 32));
    }
  */
}
