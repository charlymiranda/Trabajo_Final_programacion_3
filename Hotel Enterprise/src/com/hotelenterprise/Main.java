package com.hotelenterprise;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.login.Log;
import com.hotelenterprise.login.Logger;


public class Main {

    public static void main(String[] args) {



        Gson file = new GsonBuilder().create();


        Logger login = new Logger();

     //   login.logueador();

        Log login2 = new Log();

        login2.login();



    }
}
