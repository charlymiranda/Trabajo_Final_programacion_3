package com.hotelenterprise.menu;


import java.awt.*;
import java.util.Scanner;

public class Menu {
        static Scanner scanner = new Scanner(System.in);
        static int select = -1; //opción elegida del usuario
        static int num1 = 0, num2 = 0; //Variables
        Colours color = new Colours();


    public void menuAdministrador() {

            //Mientras la opción elegida sea 0, preguntamos al usuario
            while(select != 0){
                //Try primero para que el camino sea un paraiso
                try{

                 //  System.out.println("\033[35mEste texto es MAGENTA");
                    System.out.println("\nChoose one of this fantastic options:\n" +
                            "\n\33[33m1.-" + color.b + " Create User" +
                            "\n\33[33m2.-" + color.b + " Backup System" +
                            "\n\33[33m3.-" + color.b + " Change Permisions" +
                            "\n\33[33m4.-" + color.b + " Set Prices" +
                            "\n\33[33m0.-" + color.b + " ¡Get away with the money!");

                    //Recoger una variable por consola
                    select = Integer.parseInt(scanner.nextLine());


                    switch(select){
                        case 1:

                            System.out.println("Create the user you deserve");

                            break;
                        case 2:

                            System.out.println("Set system backup");

                            break;
                        case 3:

                            System.out.println("Change the permisions you wanted");

                            break;
                        case 4:

                            System.out.println("Set the highest prices");

                            break;

                        case 0:
                            System.out.println("See you next time.");
                            break;
                        default:
                            System.out.println("\033[31mThis option is not allowed" +color.b);break;
                    }

                    System.out.println("\n");

                }catch(Exception e){

                    System.out.println("\033[31mYou can choose only numbers" +color.b);

                }
            }

        }



    public void menuReceptionist() {

        //Mientras la opción elegida sea 0, preguntamos al usuario
        while(select != 0){

            try{
                System.out.println("\nChoose one of the options:\n" +

                        "\n\33[33m1.-" + color.b + " Charge Consumes to the room" +
                        "\n\33[33m2.-" + color.b + " Receive pay for a room" +
                        "\n\33[33m3.-" + color.b + " Make reservations" +
                        "\n\33[33m4.-" + color.b + " Cancel reservations" +
                        "\n\33[33m5.-" + color.b + " Search for room" +
                        "\n\33[33m6.-" + color.b + " Change room" +
                        "\n\33[33m0.-" + color.b + " ¡Get out of this hell!");

                select = Integer.parseInt(scanner.nextLine());


                switch(select){
                    case 1:

                        System.out.println("Charge all consumes here");

                        break;
                    case 2:

                        System.out.println("Receive paymment for the room");

                        break;
                    case 3:

                        System.out.println("Make a good all fashion reservation");

                        break;
                    case 4:

                        System.out.println("If you cancel you receive less money");
                        break;

                    case 5:

                        System.out.println("Search for the room you wanted");

                        break;
                    case 6:

                        System.out.println("Change room for that anoying guy");


                        break;
                    case 0:
                        System.out.println( "See you next time, if you continue working...");
                        break;
                    default:
                        System.out.println("\033[31mThis option is not allowed" +color.b);
                       break;
                }

                System.out.println("\n");

            }catch(Exception e){
                System.out.println("\033[31mYou can choose only numbers" +color.b);

            }
        }

    }


    }



