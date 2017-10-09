package com.additionaltasks;

public class Room {

   // private int id;
    private Person person;
  /*  public static int i;
    public static int max;
    private int emptyRooms;

    public Room() {
        id = i;
    }*/

    public Room(Person person/*, int max*/) {

        //this();
        this.person = person;
      /*  if (person !=null ) {
        i++;
        id = i;
        max = max - i;

        if (max >= 0) {
            emptyRooms = max;
        } else {
            System.out.println("You want to rent more rooms that exists in this hotel!!!!");
            throw new IllegalArgumentException();
        }

        }*/
    }
  /*  public int getId() {
        return id;
    }


    public int getEmptyRooms() {
        return emptyRooms;
    }*/

    public Person getPerson() {
        return person;
    }
/*
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return id == room.id;
    }

    @Override
    public int hashCode() {
        return id;
    }*/
}
