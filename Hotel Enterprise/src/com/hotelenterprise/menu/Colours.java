package com.hotelenterprise.menu;

public class Colours
{

    public String b = "\u001B[0m"; //borrar
    private static String black = "\033[30m";
    private static String red = "\033[31m";
    private static String green = "\033[32m";
    private static String yellow = "\033[33m";
    private static String blue = "\033[34m";
    private static String purple = "\033[35m";
    private static String cyan = "\033[36m";
    private static String white = "\033[37m";
    private static String reset = "\u001B[0m";

    public Colours() {
    }

    public void coloron()
    {
        System.out.println("////////// FORMA 1: CON VARIABLES DECLARADAS //////////\n");
/*
        colorearMensaje(black,"Este texto está en color NEGRO");
        colorearMensaje(red,"Este texto está en color ROJO");
        colorearMensaje(green,"Este texto está en color VERDE");
        colorearMensaje(yellow,"Este texto está en color AMARILLO");
        colorearMensaje(blue,"Este texto está en color AZUL");
        colorearMensaje(purple,"Este texto está en color MAGENTA");
        colorearMensaje(cyan,"Este texto está en color CYAN");
        colorearMensaje(white,"Este texto está en color BLANCO");
*/
        System.out.println("\n////////// FORMA 2: AGREGANDO EL STRING AL MENSAJE ////\n");

        System.out.println("\033[30mEste texto es NEGRO");
        System.out.println("\033[31mEste texto es ROJO");
        System.out.println("\033[32mEste texto es VERDE");
        System.out.println("\033[33mEste texto es AMARILLO");
        System.out.println("\033[34mEste texto es AZUL");
        System.out.println("\033[35mEste texto es ROSA");
        System.out.println("\033[36mEste texto es CELESTE");
        System.out.println("\033[37mEste texto es BLANCO");

       // System.exit(0);
    }

  //  public void colorearMensaje(String color, String mensaje) { System.out.println(color + mensaje + reset); }
}

