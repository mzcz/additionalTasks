package com.additionaltasks;

//1
public class Student {
    private long pesel;
    private String name;
    private String lastName;
    private String eyeColour;

    public Student(long pesel, String name, String lastName, String eyeColour) {
        this.pesel = pesel;
        this.name = name;
        this.lastName = lastName;
        this.eyeColour = eyeColour;
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

    public String getEyeColour() {
        return eyeColour;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        return this.pesel == ((Student) o).pesel;
    }

    @Override
    public int hashCode() {
        return (int) (pesel ^ (pesel >>> 32));
    }

    @Override
    public String toString() {
        return "Student{" +
                "pesel='" + pesel + '\'' +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", eyeColour='" + eyeColour + '\'' +
                '}';
    }
}