package com.hotelenterprise;


import com.google.gson.Gson;

import com.google.gson.GsonBuilder;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.login.Log;
import com.hotelenterprise.login.Logger;
import com.hotelenterprise.login.Logos;
import com.hotelenterprise.menu.Menu;


public class Main {

    public static void main(String[] args) {



        Gson file = new GsonBuilder().create();



        Logos logueador = new Logos();

        logueador.logeator();




    }
}
