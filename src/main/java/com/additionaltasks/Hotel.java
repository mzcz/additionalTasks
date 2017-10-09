package com.additionaltasks;

public class Hotel {

    private String name;
    private int listOfRooms;

    public Hotel(String name, int listOfRooms) {
        this.name = name;
        this.listOfRooms = listOfRooms;
    }

    public String getName() {
        return name;
    }

    public int getListOfRooms() {
        return listOfRooms;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Hotel hotel = (Hotel) o;

        return name.equals(hotel.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}


