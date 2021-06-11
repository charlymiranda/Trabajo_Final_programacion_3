package com.hotelenterprise.file;

import com.hotelenterprise.functionality.DocumentType;
import com.hotelenterprise.functionality.RoomType;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.client.Guest;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.services.Product;

import java.io.File;
import java.io.IOException;
import java.security.KeyStore;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFiles {
    public static void main(String[] args) throws IOException {

        Hotel hotel = new Hotel();

        Administrator admin = new Administrator();
        List<Guest> guestList = new ArrayList<>();
        Address address = new Address("Mar del plata", "Dolores","961", "false", "False");
        Client client = new Client("Carlos", "Miranda", DocumentType.DNI, "34473301", "156096360", address, "mirandacarlosmi@gmail.com",
                15, 101, guestList);

        hotel.setClientList(client);


       Room room1 = new Room(101, TypeOfRoom.SINGLE, RoomType.SINGLE, false, 2000);
        Room room2 = new Room(102, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room3 = new Room(103, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room4 = new Room(104, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room5 = new Room(105, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room6 = new Room(106, TypeOfRoom.TRIPLE, RoomType.TRIPLE, false, 4000);
        Room room7 = new Room(107, TypeOfRoom.QUADRUPLE, RoomType.QUADRUPLE, false, 5000);
        Room room8 = new Room(201, TypeOfRoom.SINGLE, RoomType.SINGLE, false, 2000);
        Room room9 = new Room(202, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room10 = new Room(203, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room11 = new Room(204, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room12 = new Room(205, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room13 = new Room(206, TypeOfRoom.TRIPLE, RoomType.TRIPLE, false, 4000);
        Room room14 = new Room(207, TypeOfRoom.QUADRUPLE, RoomType.QUADRUPLE, false, 5000);
        Room room15 = new Room(301, TypeOfRoom.SINGLE, RoomType.SINGLE, false, 2000);
        Room room16 = new Room(302, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room17 = new Room(303, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room18 = new Room(304, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room19 = new Room(305, TypeOfRoom.DOUBLE, RoomType.DOUBLE, false, 3000);
        Room room20 = new Room(306, TypeOfRoom.TRIPLE, RoomType.TRIPLE, false, 4000);
        Room room21 = new Room(307, TypeOfRoom.QUADRUPLE, RoomType.QUADRUPLE, false, 5000);

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

        hotel.setRoomList(roomList);

        Product product1 = new Product("Coffee", 250);
        Product product2 = new Product("Cafe con leche", 250);
        Product product3 = new Product("Te", 250);
        Product product4 = new Product("Smoothie", 250);
        Product product5 = new Product("Juice", 250);
        Product product6 = new Product("Coke", 250);
        Product product7 = new Product("Sprite", 250);
        Product product8 = new Product("Water", 250);
        Product product9 = new Product("Media luna", 250);
        Product product10 = new Product("Sandwich", 250);

        List<Product> productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);
        productList.add(product5);
        productList.add(product6);
        productList.add(product7);
        productList.add(product8);
        productList.add(product9);
        productList.add(product10);
        hotel.setProductList(productList);

        hotel.writeIntoJsonFile();

       //FileManagement.appendFile("DataFiles\\Rooms.bin", roomList );
     //  FileManagement.appendFile("DataFiles\\Rooms.bin", room1);
        //FileManagement.readFile("DataFiles\\Rooms.bin");
    }
}
