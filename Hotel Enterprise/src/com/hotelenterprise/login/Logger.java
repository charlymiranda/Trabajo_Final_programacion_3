package com.hotelenterprise.login;

import java.io.*;
import java.util.Scanner;

public class Logger {

    private static Scanner sc;

    public void logueador() {

        int nLines=0;
        int i=0;
        String [] users = null;
        String line;

          Scanner scan = null;
       try {

            File leer = new File("\\TP final labo 3\\Hotel Enterprise\\Claves.txt");

            scan = new Scanner(leer);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            sc = new Scanner(new File("\\TP final labo 3\\Hotel Enterprise\\Claves.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        File f = new File("\\TP final labo 3\\Hotel Enterprise\\Claves.txt");
        FileReader rd = null;
        try {
            rd = new FileReader(f);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        BufferedReader br = new BufferedReader(rd);

        while (true){
            try {
                if (!((line=br.readLine()) !=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }
            nLines++;
        } users = new String[nLines];  // Tamaño del arreglo

        while (sc.hasNextLine()){
            users[i++] = sc.nextLine();  // Se almacena una linea en cada posicion del arreglo

        }

        System.out.println("\s\n----------------------------------------------------------");

        System.out.println("                     Hotel Enterprise");
        System.out.println("\s\n----------------------------------------------------------");

        Scanner keyboard = new Scanner (System.in);
        System.out.println("                    Ingrese su usuario");

        String user = sc.nextLine(                      );
        String inpUser = keyboard.nextLine();

        System.out.println("                   Ingrese su contraseña");

        String pass = sc.nextLine();
        String inpPass = keyboard.nextLine();



        for (int o = 0; o < users.length; o++) {

            if (users[o].equalsIgnoreCase(inpUser) && users[o + 1].equals(inpPass)){


           // if (inpUser.equals(user) && inpPass.equals(pass)) {
                System.out.print("                 Bienvenido al sistema "+  inpUser);
                break;
            } else {
                System.out.print(" \n   Usuario o clave incorrectos. Vuelva a intentarlo");
                System.out.println("\s\n\n----------------------------------------------------------");
                break;
            }

        }}

}
