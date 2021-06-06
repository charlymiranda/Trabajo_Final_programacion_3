package com.hotelenterprise;


import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import com.hotelenterprise.functionality.Facture;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.login.Log;
import com.hotelenterprise.login.Logger;
import com.hotelenterprise.login.Logos;
import com.hotelenterprise.menu.Menu;
import com.hotelenterprise.person.user.Recepcionist;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {



        Gson file = new GsonBuilder().create();


        //Logger login = new Logger();

        //Logos logueador = new Logos();

        //logueador.logeator();

<<<<<<< Updated upstream
      //  Log login2 = new Log();
=======
        Facture facture = new Facture();

    //    facture.facture();

>>>>>>> Stashed changes

        //login2.login();

<<<<<<< Updated upstream
        Recepcionist charly = new Recepcionist();
        Hotel hotel = new Hotel();
        charly.newBook(hotel);
=======
        }

>>>>>>> Stashed changes

    }

