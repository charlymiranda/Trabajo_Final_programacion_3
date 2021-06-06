package com.hotelenterprise.menu;

public class Colours
{
    public String b = "\u001B[0m"; //borrar
    public String black = "\033[30m";
    public String red = "\033[31m";
    public String green = "\033[32m";
    public String yellow = "\033[33m";
    public String blue = "\033[34m";
    public String purple = "\033[35m";
    public String cyan = "\033[36m";
    public String white = "\033[37m";
    public String reset = "\u001B[0m";

/*
    public String b = "\u001B[0m"; //borrar
    private static String black = "\033[30m";
    public String red = "\033[31m";
    private static String green = "\033[32m";
    private static String yellow = "\033[33m";
    private static String blue = "\033[34m";
    private static String purple = "\033[35m";
    private static String cyan = "\033[36m";
    private static String white = "\033[37m";
    private static String reset = "\u001B[0m";
*/
    public Colours() {
    }

    public void coloron()
    {
    //    System.out.println("////////// FORMA 1: CON VARIABLES DECLARADAS //////////\n");

        colorearMensaje(black,"Este texto está en color NEGRO");
        colorearMensaje(red,"Este texto está en color ROJO");
        colorearMensaje(green,"Este texto está en color VERDE");
        colorearMensaje(yellow,"Este texto está en color AMARILLO");
        colorearMensaje(blue,"Este texto está en color AZUL");
        colorearMensaje(purple,"Este texto está en color MAGENTA");
        colorearMensaje(cyan,"Este texto está en color CYAN");
        colorearMensaje(white,"Este texto está en color BLANCO");

    }

    public void colorearMensaje(String color, String mensaje) { System.out.println(color + mensaje + reset); }
}

