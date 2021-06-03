package com.hotelenterprise.file;

import com.hotelenterprise.hotel.Room;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TestFiles {
    public static void main(String[] args) throws IOException {
        //FileManagement.newFile("DataFiles\\Rooms.bin");

        Room room1 = new Room(101, "Habitacion doble", false);
        Room room2 = new Room(102, "Habitacion doble", false);
        Room room3 = new Room(103, "Habitacion doble", false);
        Room room4 = new Room(104, "Habitacion doble", false);
        Room room5 = new Room(105, "Habitacion triple", false);
        Room room6 = new Room(106, "Habitacion triple", false);
        Room room7 = new Room(107, "Habitacion cuadruple", false);
        Room room8 = new Room(201, "Habitacion doble", false);
        Room room9 = new Room(202, "Habitacion doble", false);
        Room room10 = new Room(203, "Habitacion doble", false);
        Room room11 = new Room(204, "Habitacion doble", false);
        Room room12 = new Room(205, "Habitacion triple", false);
        Room room13 = new Room(206, "Habitacion triple", false);
        Room room14 = new Room(207, "Habitacion cuadruple", false);
        Room room15 = new Room(301, "Habitacion doble", false);
        Room room16 = new Room(302, "Habitacion doble", false);
        Room room17 = new Room(303, "Habitacion doble", false);
        Room room18 = new Room(304, "Habitacion doble", false);
        Room room19 = new Room(305, "Habitacion triple", false);
        Room room20 = new Room(306, "Habitacion triple", false);
        Room room21 = new Room(307, "Habitacion cuadruple", false);

        List<Room> roomList = new ArrayList<>();
        roomList.add(room1);
        roomList.add(room2);
        roomList.add(room3);
        roomList.add(room4);
        roomList.add(room5);
        roomList.add(room6);
        roomList.add(room7);
        roomList.add(room8);
        roomList.add(room9);
        roomList.add(room10);
        roomList.add(room11);
        roomList.add(room12);
        roomList.add(room13);
        roomList.add(room14);
        roomList.add(room15);
        roomList.add(room16);
        roomList.add(room17);
        roomList.add(room18);
        roomList.add(room19);
        roomList.add(room20);
        roomList.add(room21);


       //FileManagement.appendFile("DataFiles\\Rooms.bin", roomList );
     //  FileManagement.appendFile("DataFiles\\Rooms.bin", room1);
        FileManagement.readFile("DataFiles\\Rooms.bin");
    }
}
