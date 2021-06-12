package com.hotelenterprise.login;

import com.hotelenterprise.functionality.ProductPrice;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.person.user.Recepcionist;
import com.hotelenterprise.services.Product;
import com.hotelenterprise.utilities.Console;

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


































}
