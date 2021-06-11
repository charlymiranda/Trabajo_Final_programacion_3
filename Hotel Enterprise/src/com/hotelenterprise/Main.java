package com.hotelenterprise;


import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import com.hotelenterprise.functionality.Facture;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.login.Log;
import com.hotelenterprise.login.Logger;
import com.hotelenterprise.login.Logos;
import com.hotelenterprise.menu.Menu;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.person.user.Employee;
import com.hotelenterprise.person.user.Recepcionist;
import com.hotelenterprise.utilities.Console;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {


        Gson file = new GsonBuilder().create();
        Hotel hotel = new Hotel();

            Address ad = new Address("Mar del plata", "Dolores","462","no", "no");
         Administrator admin = new Administrator("Charly2","Miranda","dni", "3245253","223571156",ad,"charly.com","2","charly2","man",true);
        hotel.setAdministrator(admin);
         Recepcionist rece = new Recepcionist("Eze","Miranda","dni","3245253","223571156",ad,"charly.com","2","eze","hola",true);
        hotel.setRecepcionist(rece);
    

        Menu menu = new Menu();
        menu.menu(hotel);


    }

}





