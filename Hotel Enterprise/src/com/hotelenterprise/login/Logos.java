package com.hotelenterprise.login;

import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.utilities.Console;

import java.io.*;

public class Logos {

    public Logos() {
    }

    public void logeator()
    {
        Colours color = new Colours();
        String username;
        String password;


       // System.out.println("¡Welcome to the Enterprise Hotel!");
        System.out.println("\n\033[34m¡Welcome to the ENTERPRISE HOTEL!" +color.b);
        System.out.println("\nEnter your username and password to login:");

        System.out.print("Username: ");
        username = Console.read();

        System.out.print("Password: ");
              password = Console.read();

        UsersLog login = new UsersLog(username, password);

        if(login.checkPassword())

        System.out.println("\033[32mEnterprise Hotel all rights reserved." +color.b);
        else

            System.out.println("\033[31mUsername or password are incorrect. Exit system." +color.b);

    }


}
