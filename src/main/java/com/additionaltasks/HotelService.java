package com.additionaltasks;

import java.util.*;

public class HotelService {

    public static void main(String[] args){

        Hotel hotel = new Hotel("Sheraton", 9);

        int maxRooms = hotel.getListOfRooms();

        Room room1 = new Room(new Person(0L, "N/A","N/A"));
        Room room2 = new Room(new Person(90010144678L, "Marian","Zborowski"));
        Room room3 = new Room(new Person(90010144678L, "Marian","Zborowski"));
        Room room4 = new Room(new Person(0L, "N/A","N/A"));
        Room room5 = new Room(new Person(90020298876L, "Mirek","Lasocki"));
        Room room6 = new Room(new Person(90020298876L, "Mirek","Lasocki"));
        Room room7 = new Room(new Person(90020298876L, "Mirek","Lasocki"));
        Room room8 = new Room(new Person(0L, "N/A","N/A"));
        Room room9 = new Room(new Person(0L, "N/A","N/A"));
        //Room room10 = new Room(new Person(80020998876L, "Marek","Marek"),maxRooms); //Exception in thread "main" java.lang.IllegalArgumentException

        Map<Integer, Room> theRooms = new HashMap<>();

        theRooms.put(1,room1);
        theRooms.put(2,room2);
        theRooms.put(3,room3);
        theRooms.put(4,room4);
        theRooms.put(5,room5);
        theRooms.put(6,room6);
        theRooms.put(7,room7);
        theRooms.put(8,room8);
        theRooms.put(9,room9);

        int emptyRooms=0;
        Map<Integer, Room> freeRooms = new HashMap<>();

            for(Map.Entry<Integer, Room> entry :theRooms.entrySet()){
                System.out.println("Room" + entry.getKey() + " rent by " + " Person "
                + entry.getValue().getPerson().getName() + " "+ entry.getValue().getPerson().getLastName()
                );
                if (entry.getValue().getPerson().getPesel() == 0L) {
                    freeRooms.put(entry.getKey(), entry.getValue());

                    System.out.println("Room FREE " + entry.getKey());
                    emptyRooms++;
                }
        }

        System.out.println("Empty Rooms " + emptyRooms);


        int rentRoom = rentFreeRoom(new Person(80020298891L, "Marcelilna","Wolna"),theRooms, freeRooms);

        System.out.println("Room " + rentRoom + " was rent");

        int rentRoom2 = rentFreeRoom(new Person(70020198891L, "Kunegunda","Niemiecka"),theRooms, freeRooms);

        System.out.println("Room " + rentRoom2 + " was rent");

        int rentRoom3 = rentFreeRoom(new Person(70020198891L, "Kunegunda","Niemiecka"),theRooms, freeRooms);

        System.out.println("Room " + rentRoom3 + " was rent");

        int rentRoom4 = rentFreeRoom(new Person(86020198892L, "Ignacy","Pankracy"),theRooms, freeRooms);

        System.out.println("Room " + rentRoom4 + " was rent");

        int rentRoom5 = rentFreeRoom(new Person(82020198892L, "Bonifacy","Kotek"),theRooms, freeRooms);

        System.out.println("Room " + rentRoom5 + " was rent");

        for(Map.Entry<Integer, Room> entry :theRooms.entrySet()) {
            System.out.println("NewRoom " + entry.getKey() + " rent by " + " Person "
                    + entry.getValue().getPerson().getName() + " "+ entry.getValue().getPerson().getLastName()
            );
        }

        boolean getSurname = getLastName("Kotek", theRooms);
        System.out.println(getSurname);

        boolean getSurname2 = getLastName("pankracy", theRooms);
        System.out.println(getSurname2);

        checkOutPerson("Lasocki", theRooms);

        for(Map.Entry<Integer, Room> entry :theRooms.entrySet()) {
            System.out.println("NewRoom " + entry.getKey() + " rent by " + " Person "
                    + entry.getValue().getPerson().getName() + " "+ entry.getValue().getPerson().getLastName()
            );
        }
    }

    public static int rentFreeRoom(Person person, Map<Integer, Room> theRooms, Map<Integer, Room> freeRooms){

        int freeRoom=0;
        System.out.println("FREE ROOMS " + freeRooms.size());

        if (freeRooms.isEmpty()) {
            System.out.println("Lack of free rooms!!!");
            return freeRooms.size();
        } else{
            for (Map.Entry<Integer, Room> entryFreeRoom : freeRooms.entrySet()) {
                //if (entryFreeRoom.getValue().getPerson().getPesel() == 0L) {
                System.out.println("Free room " + entryFreeRoom.getKey() + " " + entryFreeRoom.getValue().getPerson().getName());
                freeRoom = entryFreeRoom.getKey();//last room
                // }
            }
            Room newRroom = new Room(person);
            theRooms.put(freeRoom,newRroom);
            freeRooms.remove(freeRoom);
        }

        return freeRoom;
    }

    public static boolean getLastName(String lastName, Map<Integer, Room> theRooms) {

        for (Map.Entry<Integer, Room> entry : theRooms.entrySet()) {
            if (entry.getValue().getPerson().getLastName().equalsIgnoreCase(lastName)) {
                return true;
            }
        }

        return false;
    }


    public static void checkOutPerson(String lastName, Map<Integer, Room> theRooms) {

        Room room = new Room(new Person(0L, "N/A", "N/A"));

        for (Map.Entry<Integer, Room> entry : theRooms.entrySet()) {
            if (entry.getValue().getPerson().getLastName().equalsIgnoreCase(lastName)) {
                theRooms.put(entry.getKey(), room);
            }
        }
    }
}
