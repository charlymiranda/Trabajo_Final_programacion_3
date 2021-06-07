package com.hotelenterprise.menu;


import com.hotelenterprise.functionality.Facture;

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
                     System.out.println
                           ("\nChoose one of the following options to help the useless:\n"  +
                            "\n\33[34m1.-" + color.b + " \33[34mMake reservations" + color.b +
                            "\n\33[34m2.-" + color.b + " \33[34mCancel reservations" + color.b +
                            "\n\33[34m3.-" + color.b + " \33[34mCHECKIN" + color.b +
                            "\n\33[34m4.-" + color.b + " \33[34mSearch for room" + color.b +
                            "\n\33[34m5.-" + color.b + " \33[34mChange room" + color.b +
                            "\n\33[34m6.-" + color.b + " \33[34mCharge Consumes to the room" + color.b +
                            "\n\33[34m7.-" + color.b + " \33[34mCHECKOUT" + color.b +

                            "\n\nor Choose one of this magnanimun options:\n" +
                            "\n\33[33m8.-" + color.b + "\33[33m Create User" + color.b +
                            "\n\33[33m9.-" + color.b + "\33[33m Backup System" + color.b +
                            "\n\33[33m10.-" + color.b + "\33[33m Change Permisions" + color.b +
                            "\n\33[33m11.-" + color.b + "\33[33m Set Prices" + color.b +
                            "\n\n0.- If you want to rest, you can go.");

                    //Recoger una variable por consola
                    select = Integer.parseInt(scanner.nextLine());


                    switch(select){
                        case 1:

                            System.out.println("Make a good all fashion reservation");


                            break;
                        case 2:
                            System.out.println("If you cancel you receive less money");

                            break;
                        case 3:

                            System.out.println("CHECKIN");

                            break;
                        case 4:
                            System.out.println("Search for the room you needed");

                            break;

                        case 5:

                            System.out.println("Change room of that annoying guy");
                            break;
                        case 6:

                            System.out.println("Change all consumes to the room. Always offer more");


                            break;
                        case 7:
                            System.out.println("CHECKOUT");

                            Facture f = new Facture();
                            f.facture();

                            break;

                        case 8:

                            System.out.println("Create the user you deserve");

                            break;
                        case 9:

                            System.out.println("Set system backup");

                            break;
                        case 10:

                            System.out.println("Change the permisions you wanted");

                            break;
                        case 11:

                            System.out.println("Set the highest prices");

                            break;

                        case 0:
                            System.out.println("Comeback whenever you want.");
                            break;
                        default:
                            System.out.println("\033[31mIm trullt sorry, this option is not allowed...yet" +color.b);break;
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
                System.out.println("\nChoose one of the following options and go to work:\n"  +
                        "\n\33[34m1.-" + color.b + " \33[34mMake reservations" + color.b +
                        "\n\33[34m2.-" + color.b + " \33[34mCancel reservations" + color.b +
                        "\n\33[34m3.-" + color.b + " \33[34mCHECKIN" + color.b +
                        "\n\33[34m4.-" + color.b + " \33[34mSearch for room" + color.b +
                        "\n\33[34m5.-" + color.b + " \33[34mChange room" + color.b +
                        "\n\33[34m6.-" + color.b + " \33[34mCharge Consumes to the room" + color.b +
                        "\n\33[34m7.-" + color.b + " \33[34mCHECKOUT" + color.b +
                        "\n\33[31m0.-" + color.b + " \33[31m¡Get out of this hell!" + color.b );

                select = Integer.parseInt(scanner.nextLine());


                switch(select){
                    case 1:

                        System.out.println("Make a good all fashion reservation");


                        break;
                    case 2:
                        System.out.println("If you cancel you receive less money");



                        break;
                    case 3:

                        System.out.println("CHECKIN");

                        break;
                    case 4:
                        System.out.println("Search for the room you needed");

                        break;

                    case 5:

                        System.out.println("Change room of that annoying guy");
                        break;
                    case 6:

                        System.out.println("Change all consumes to the room. Always offer more");


                        break;
                    case 7:
                        System.out.println("CHECKOUT");

                        Facture f = new Facture();
                        f.facture();

                        break;
                    case 0:
                        System.out.println( "\n\n\33[31mSee you next time, if you continue working..." +color.b);
                        break;
                    default:
                        System.out.println("\n\033[31mThis option is not allowed" +color.b);
                       break;
                }

                System.out.println("\n");

            }catch(Exception e){
                System.out.println("\033[31mYou can choose only numbers" +color.b);

            }
        }

    }


    }



