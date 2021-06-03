package com.hotelenterprise.login;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Logger {

    public void logueador() {



          Scanner scan = null;
        try {

            int nLines=0;
            int i=0;
            String [] usuarios = null;
            String linea;

            File leer = new File("\\TP final labo 3\\Hotel Enterprise\\Claves.txt");
            //File leer = new File("\\DataFiles\\Claves.txt");

            scan = new Scanner(leer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("\s\n----------------------------------------------------------");

        System.out.println("                     Hotel Enterprise");
        System.out.println("\s\n----------------------------------------------------------");

        Scanner keyboard = new Scanner (System.in);
            System.out.println("                    Ingrese su usuario");


            String user = scan.nextLine(                      );
            String inpUser = keyboard.nextLine();



            System.out.println("                   Ingrese su contraseña");

            String inpPass = keyboard.nextLine();
            String pass = scan.nextLine();

            if (inpUser.equals(user) && inpPass.equals(pass)) {
                System.out.print("                 Bienvenido al sistema "+  user);
            } else {
                System.out.print("    Usuario o clave incorrectos. Vuelva a intentarlo");
            }System.out.println("\s\n\n----------------------------------------------------------");
        }

}
