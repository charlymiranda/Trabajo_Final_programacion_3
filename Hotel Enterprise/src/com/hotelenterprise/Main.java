package com.hotelenterprise;


import com.hotelenterprise.functionality.ProductPrice;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.login.Logos;
import com.hotelenterprise.menu.Menu;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.person.user.Recepcionist;
import com.hotelenterprise.services.Product;


public class Main {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        // Administrator Keys: Admin: Charly - Pass: man
        // Administrator Keys: Admin: Danilo - Pass: fibro

        // Recepcionist Keys: User: Eze - Pass: hola
        // Recepcionist Keys: User: Bruno - Pass: fabri


        Logos logo = new Logos();
        logo.users(hotel);
        logo.roomers(hotel);
        logo.products(hotel);

        hotel.readFromJsonFile();

        Menu menu = new Menu();
        menu.menu(hotel);


    }

}





