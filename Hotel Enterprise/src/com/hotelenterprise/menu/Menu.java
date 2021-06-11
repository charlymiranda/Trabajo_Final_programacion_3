package com.hotelenterprise.menu;


import com.hotelenterprise.functionality.Facture;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Reservation;
import com.hotelenterprise.login.Logos;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.person.user.Recepcionist;
import com.hotelenterprise.utilities.Console;

import java.util.Scanner;

public class Menu {

    static int select = -1; //opción elegida del usuario
    static int num1 = 0, num2 = 0; //Variables
    Colours color = new Colours();
    Reservation newBook = new Reservation();
    Administrator admin = new Administrator();
    Recepcionist recep = new Recepcionist();
    //Hotel hotel = new Hotel();
    Facture f = new Facture();


    public void menu(Hotel hotel) {

        hotel.readFromJsonFile();
        Logos logo = new Logos();
        Object object = logo.logueanetor(hotel);

        if (object instanceof Administrator) {

            int aux = 0;
            //Mientras la opción elegida sea 0, preguntamos al usuario
            while (select != 0) {
                //Try primero para que el camino sea un paraiso
                try {
                    System.out.println
                            ("\n\33[33mChoose one of the following options to help the useless:\n" +
                                    "\n\33[33m1.-" + color.b + "  Make reservations" + color.b +
                                    "\n\33[33m2.-" + color.b + "  Cancel reservations" + color.b +
                                    "\n\33[33m3.-" + color.b + "  CHECKIN" + color.b +
                                    "\n\33[33m4.-" + color.b + "  Search for room" + color.b +
                                    "\n\33[33m5.-" + color.b + "  Charge Consumes to the room" + color.b +
                                    "\n\33[33m6.-" + color.b + "  CHECKOUT" + color.b +

                                    "\n\n\33[33mor Choose one of this magnanimun options:\n" +
                                    "\n\33[33m7.-" + color.b + "  Create User" + color.b +
                                    "\n\33[33m8.-" + color.b + "  Backup System" + color.b +
                                    "\n\33[33m9.-" + color.b + "  Change Permisions" + color.b +
                                    "\n\33[33m10.-" + color.b + " Set Prices" + color.b +
                                    "\n\n\33[31m0.-  If you want to rest, you can go.");

                    //Recoger una variable por consola

                    select = Console.readInteger();
                    switch (select) {
                        case 1:
                            System.out.println("Make a good all fashion reservation");
                            admin.newBook(hotel);
                            break;
                        case 2:
                            System.out.println("If you cancel you receive less money");
                            admin.cancelReservations(hotel);
                            break;
                        case 3:
                            System.out.println("CHECKIN");

                            break;
                        case 4:
                            System.out.println("Search Room");
                            aux = hotel.searchForFreeRoom();
                            if (aux == 0) {
                                System.out.println("No Vacancy ");
                            } else {
                                System.out.println("\n" + "Available room found. ¿What would you like to do? ?");
                                System.out.println("1. New Reservation \n 0. Back to Main Menu");
                                aux = Console.readInteger();
                                switch (aux) {
                                    case 1:
                                        admin.newBook(hotel);
                                        break;
                                    case 0:
                                    default:
                                        System.out.println("Error");
                                }
                            }

                            break;

                        case 5:

                            System.out.println("Charge all consumes to the room. Always offer more");


                            break;
                        case 6:

                            System.out.println("CHECKOUT");

                            f.facture();

                            break;
                        case 7:
                            System.out.println("Create the user you deserve");

                            break;

                        case 8:

                            System.out.println("Set system backup");

                            break;
                        case 9:

                            System.out.println("Change the permisions you wanted");

                            break;
                        case 10:

                            System.out.println("Set the highest prices");

                            break;

                        case 0:
                            System.out.println("Comeback whenever you want.");
                            break;
                        default:
                            System.out.println("\033[31mIm trullt sorry, this option is not allowed...yet" + color.b);
                            break;
                    }


                } catch (Exception e) {

                    System.out.println("\n\033[31mYou can choose only numbers." + color.b);

                }
            }


        } else if (object instanceof Recepcionist) {


            hotel.readFromJsonFile();
            int aux2 = 0;
            //Mientras la opción elegida sea 0, preguntamos al usuario
            while (select != 0) {

                try {
                    System.out.println("\n\33[34mChoose one of the following options and go to work:\n" + color.b +
                            "\n\33[34m1.-" + color.b + " Make reservations" + color.b +
                            "\n\33[34m2.-" + color.b + " Cancel reservations" + color.b +
                            "\n\33[34m3.-" + color.b + " CHECKIN" + color.b +
                            "\n\33[34m4.-" + color.b + " Search for room" + color.b +
                            "\n\33[34m5.-" + color.b + " Charge Consumes to the room" + color.b +
                            "\n\33[34m6.-" + color.b + " CHECKOUT" + color.b +
                            "\n\n\33[31m0.-" + color.b + "\33[31m ¡Get out of this hell!" + color.b);


                    select = Console.readInteger();

                    switch (select) {
                        case 1:

                            System.out.println("Make a good all fashion reservation");

                            recep.newBook(hotel);

                            break;
                        case 2:
                            System.out.println("If you cancel you receive less money\n");
                            recep.cancelReservations(hotel);


                            break;
                        case 3:

                            System.out.println("CHECKIN");

                            break;
                        case 4:
                            System.out.println("Search for the room you needed");

                            System.out.println("Search Room");
                            aux2 = hotel.searchForFreeRoom();
                            if (aux2 == 0) {
                                System.out.println("No Vacancy ");
                            } else {
                                System.out.println("\n" + "Available room found. ¿What would you like to do? ?");
                                System.out.println("1. New Reservation \n 0. Back to Main Menu");
                                aux2 = Console.readInteger();
                                switch (aux2) {
                                    case 1:
                                        admin.newBook(hotel);
                                        break;
                                    case 0:
                                    default:
                                        System.out.println("Error");
                                }
                            }

                            break;

                        case 5:
                            System.out.println("Charge all consumes to the room. Always offer more");

                            break;
                        case 6:

                            System.out.println("CHECKOUT");

                            f.facture();

                            break;
                        case 0:
                            System.out.println("\n\n\33[31mSee you next time, if you continue working..." + color.b);
                            break;
                        default:
                            System.out.println("\n\033[31mThis option is not allowed." + color.b);
                            break;
                    }


                } catch (Exception e) {
                    System.out.println("\n\033[31mYou can choose only numbers." + color.b);

                }
            }
        }else{
            System.out.println("\n\033[31mUSER or PASSWORD are incorrect. EXIT SYSTEM" + color.b);
        }
    }


}



