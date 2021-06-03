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



        System.out.println("101 \t 102 \t 103 \t 104 \t 105 \t 106 \t 107");
        System.out.println("201 \t 202 \t 203 \t 204 \t 205 \t 206 \t 207");
        System.out.println("301 \t 302 \t 303 \t 304 \t 305 \t 306 \t 307");
    }
}
