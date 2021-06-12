package com.hotelenterprise.login;

import com.hotelenterprise.functionality.DocumentType;
import com.hotelenterprise.functionality.ProductPrice;
import com.hotelenterprise.functionality.RoomType;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Reservation;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.client.Guest;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.person.user.Recepcionist;
import com.hotelenterprise.services.Product;
import com.hotelenterprise.utilities.Console;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Logos {

    public Logos() {
    }

    public Object logueanetor(Hotel hotel) {

        Colours color = new Colours();

        System.out.println("\n\033[34m¡Welcome to the ENTERPRISE HOTEL!" + color.b);
        System.out.println("\nEnter your username and password to login:");

        System.out.print("User: ");
        String user = Console.read();

        System.out.print("Password: ");
        String pass = Console.read();

        for (Administrator admin: hotel.getAdministratorList()) {

            if (admin.getUserName().equalsIgnoreCase(user) && admin.getPassword().equalsIgnoreCase(pass)) {

                return admin;
            }
        }
        for (Recepcionist recep: hotel.getRecepcionistList()) {

            if (recep.getUserName().equalsIgnoreCase(user) && recep.getPassword().equalsIgnoreCase(pass)) {

                return recep;
            }
       }
        return null;
    }








































public void users (Hotel hotel) {


    Address ad = new Address("Mar del plata", "Dolores", "462", "no", "no");
    Administrator admin = new Administrator("Charly", "Miranda", "dni", "32545253", "223571156", ad, "charly@hot.com", "1", "charly", "man", true);
    Administrator admin1 = new Administrator("Danilo", "Fibro", "dni", "39253874", "223571156", ad, "danilo@gmail.com", "1", "danilo", "fibro", true);
    hotel.setAdministratorList(admin);
    hotel.setAdministratorList(admin1);

    Recepcionist rece = new Recepcionist("Ezequiel", "Rage", "dni", "27416501", "2237251199", ad, "Eze@hot.com", "2", "eze", "hola", true);
    Recepcionist rece1 = new Recepcionist("Bruno", "Fabri", "dni", "37523954", "223525352", ad, "Bruno@gmail.com", "2", "bruno", "fabri", true);
    hotel.setRecepcionistList(rece);
    hotel.setRecepcionistList(rece1);

}

public void products (Hotel hotel){


    ProductPrice product = new ProductPrice();

    Product product1 = new Product("coffee", 250);
    Product product2 = new Product("coffewithmilk", 250);
    Product product3 = new Product("tea", 250);
    Product product4 = new Product("smoothie", 250);
    Product product5 = new Product("juice", 250);
    Product product6 = new Product("coke", 250);
    Product product7 = new Product("sprite", 250);
    Product product8 = new Product("water", 250);
    Product product9 = new Product("halfmoon", 250);
    Product product10 = new Product("toast", 250);
    hotel.getProductList().add(product1);
    hotel.getProductList().add(product2);
    hotel.getProductList().add(product3);
    hotel.getProductList().add(product4);
    hotel.getProductList().add(product5);
    hotel.getProductList().add(product6);
    hotel.getProductList().add(product7);
    hotel.getProductList().add(product8);
    hotel.getProductList().add(product9);
    hotel.getProductList().add(product10);



}



public void roomers (Hotel hotel){

    Room roomi = new Room(101, TypeOfRoom.SINGLE, "Room for one", true, 1000);
    Room roomi2 = new Room(102, TypeOfRoom.SINGLE, "Room for one", true, 1000);
    Room roomi3 = new Room(103, TypeOfRoom.SINGLE, "Room for one", true, 1000);
    Room roomi4 = new Room(104, TypeOfRoom.DOUBLE, "Room for one", true, 1500);
    Room roomi5 = new Room(105, TypeOfRoom.DOUBLE, "Room for one", true, 1500);
    Room roomi6 = new Room(106, TypeOfRoom.DOUBLE, "Room for one", true, 1500);
    Room roomi7 = new Room(107, TypeOfRoom.TRIPLE, "Room for one", true, 2000);
    Room roomi8 = new Room(108, TypeOfRoom.QUADRUPLE, "Room for one", true, 2500);


    hotel.getRoomList().add(roomi);
    hotel.getRoomList().add(roomi2);
    hotel.getRoomList().add(roomi3);
    hotel.getRoomList().add(roomi4);
    hotel.getRoomList().add(roomi5);
    hotel.getRoomList().add(roomi6);
    hotel.getRoomList().add(roomi7);
    hotel.getRoomList().add(roomi8);


}


public void reservations (Hotel hotel){


    Address addresscharly = new Address("Mar del plata", "Dolores", "961", "no", "no");

    /** ADMINITRADORES*/
    Administrator admin = new Administrator("Charly", "Miranda", DocumentType.DNI, "34473301", "156096360",addresscharly,
            "mirandacarlosmi@gmil.com", "1", "charly", "man", true);
    Administrator admin2 = new Administrator("Ezequiel", "Jaime", DocumentType.DNI, "28373301", "156096360",addresscharly,
            "ezequieljaime@mail.com", "1", "Eze", "man", true);

    hotel.setAdministratorList(admin);
    hotel.setAdministratorList(admin2);


    /** RECEPCIONISTAS*/
    Recepcionist recepcionist = new Recepcionist("Vale", "Alberola", DocumentType.DNI, "32056538", "15632459",
            addresscharly, "valealbe@mail.com", "2", "vale", "woman",true);
    Recepcionist recepcionist2 = new Recepcionist("Dai", "Catalano", DocumentType.DNI, "32056538", "15632459",
            addresscharly, "daicata@mail.com", "2", "vale", "woman",true);
    hotel.setRecepcionistList(recepcionist2);
    hotel.setRecepcionistList(recepcionist);


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
    Client client1 = new Client();
    List<Room> rooms1 = new ArrayList<>();
    rooms1.add(room1);
    List<Room> rooms2 = new ArrayList<>();
    rooms2.add(room2);
    rooms2.add(room3);
    List<Room> rooms3 = new ArrayList<>();
    rooms3.add(room4);
    List<Room> rooms4 = new ArrayList<>();
    rooms4.add(room5);
    List<Room> rooms5 = new ArrayList<>();
    rooms5.add(room6);
    List<Room> rooms6 = new ArrayList<>();
    rooms6.add(room7);
    rooms6.add(room8);
    List<Room> rooms7 = new ArrayList<>();
    rooms7.add(room9);
    rooms7.add(room10);
    List<Room> rooms8 = new ArrayList<>();
    rooms8.add(room11);
    List<Room> rooms9 = new ArrayList<>();
    rooms9.add(room12);
    List<Room> rooms10 = new ArrayList<>();
    rooms10.add(room13);
    List<Room> rooms11 = new ArrayList<>();
    rooms11.add(room14);



    Reservation reservation1 = new Reservation(1, client,LocalDate.now(), LocalDate.of(2021,06, 17), LocalDate.of(2021, 06, 25), 2, 1, rooms1, 3000);
    Reservation reservation2 = new Reservation(2, client,LocalDate.now(), LocalDate.of(2021,06, 20), LocalDate.of(2021, 06, 26), 4, 2, rooms2, 6000);
    Reservation reservation3 = new Reservation(3, client,LocalDate.now(), LocalDate.of(2021,06, 21), LocalDate.of(2021, 06, 27), 3, 1, rooms3, 3000);
    Reservation reservation4 = new Reservation(4, client,LocalDate.now(), LocalDate.of(2021,06, 18), LocalDate.of(2021, 06, 25), 2, 1, rooms4, 3000);
    Reservation reservation5 = new Reservation(5, client,LocalDate.now(), LocalDate.of(2021,06, 19), LocalDate.of(2021, 06, 28), 1, 1, rooms5, 3000);
    Reservation reservation6 = new Reservation(6, client,LocalDate.now(), LocalDate.of(2021,06, 23), LocalDate.of(2021, 06, 26), 3, 2, rooms6, 6000);
    Reservation reservation7 = new Reservation(7, client,LocalDate.now(), LocalDate.of(2021,06, 24), LocalDate.of(2021, 06, 29), 4, 2, rooms7, 6000);
    Reservation reservation8 = new Reservation(8, client,LocalDate.now(), LocalDate.of(2021,06, 20), LocalDate.of(2021, 06, 30), 2, 1, rooms8, 3000);
    Reservation reservation9 = new Reservation(9, client,LocalDate.now(), LocalDate.of(2021,06, 16), LocalDate.of(2021, 06, 26), 3, 1, rooms9, 3000);
    Reservation reservation10 = new Reservation(11, client,LocalDate.now(), LocalDate.of(2021,06, 23), LocalDate.of(2021, 06, 28), 1, 1, rooms10, 3000);
    Reservation reservation11 = new Reservation(12, client,LocalDate.now(), LocalDate.of(2021,06, 22), LocalDate.of(2021, 06, 27), 2, 1, rooms11, 3000);

    List<Reservation> reservations = new ArrayList<>();
    reservations.add(reservation1);
    reservations.add(reservation2);
    reservations.add(reservation3);
    reservations.add(reservation4);
    reservations.add(reservation5);
    reservations.add(reservation6);
    reservations.add(reservation7);
    reservations.add(reservation8);
    reservations.add(reservation9);
    reservations.add(reservation10);
    reservations.add(reservation11);

    hotel.setReservationList(reservations);



    // admin.newBook(hotel);
    //   admin.createRecepcionist(hotel);
    hotel.writeIntoJsonFile();



    //FileManagement.appendFile("DataFiles\\Rooms.bin", roomList );
    //fileManagement.appendFile("DataFiles\\Rooms.bin", room1);
    //FileManagement.readFile("DataFiles\\Rooms.bin");

}

































}
