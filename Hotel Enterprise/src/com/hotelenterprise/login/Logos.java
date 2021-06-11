package com.hotelenterprise.login;

import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.person.user.Administrator;
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


}
