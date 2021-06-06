package com.hotelenterprise.login;

import com.hotelenterprise.utilities.Console;

import java.io.*;
import java.util.Scanner;

public class Log {

    private static Scanner sc;
    private static int tries;   // Intentos para el ingreso



    public Log() {

    }

    public static void setTries (int tries){
        Log.tries = tries;

    }

    public static void login(){
        Scanner scan = new Scanner(System.in);
        int nLines=0;
        int i=0;
        String [] users = null;
        String line;

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

        } tries ++;
/*
    // String user="Eze", password = "hola";
     String user= null, password = null;
        Security s = new Security();

        System.out.print("Ingrese usuario: ");
        user = Console.read();
        System.out.print("Ingrese contraseña: ");
        password = Console.read();

*/
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





       // s.usersValidate(users, user, password, tries);

    }



    
}
