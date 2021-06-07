package com.hotelenterprise.functionality;

import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.utilities.Console;

import java.util.Scanner;

public class Facture {


    public Facture() {
    }

    public void facture() {
    int habitacion;
    int payMethod;
    double roomprice, precio, subTotal = 0, pago, total, Iva, discount, discountPayMethod;
    int Cantidad, Opcion;
    Scanner Prod = new Scanner(System.in);
    Colours color = new Colours();


    do {
        System.out.println("\n\33[34mEnter the type of room" + color.b);

        RoomPrice.typeofRoom();
        habitacion = Console.readInteger();

        if(habitacion == 1){
            roomprice = RoomPrice.SINGLE;
        }else if (habitacion == 2){
            roomprice = RoomPrice.DOUBLE;
        }else if (habitacion == 3){
            roomprice = RoomPrice.TRIPLE;
        }else{
            roomprice = RoomPrice.QUADRUPLE;
        }


        System.out.println("\n\33[34mEnter the cuantity of products loaded to the room "+ color.b);
        Cantidad = Prod.nextInt();
        precio = ProductPrice.GENERALPRICE; //Prod.nextDouble(); Habria que traer la cantidad de productos cargados de otro lado tambien
        pago = Cantidad * precio;

        System.out.println("\n\33[34mEnter payment Method "+ color.b);

        PayType.typeofpay();
        payMethod= Console.readInteger();

        if (payMethod == 1){
            System.out.println("\n\033[34mGuest receives 20% discount for Cash payment " + "\033[34m" + color.b);

        }else if(payMethod == 2){
            System.out.println("\n\033[34mGuest receives 15% discount for Mercado Pago " + "\033[34m" + color.b);

        }else if(payMethod == 3){
            System.out.println("\n\033[34mGuest receives 10% discount for Bank Transfer " + "\033[34m" + color.b);

        }else{
            //System.out.println("\n\033[35mNo recibe descuento "  + color.b);   // Ver con Charly cual de las dos queda mejor
            color.colorearMensaje(color.red, "Guest doesnt receive discount");
        }



        System.out.println("\n\33[34m¿Do you want to add something else?"+ color.b
                + "\n1-Yes"
                + "\n2-No");

        Opcion = Prod.nextInt();
       
    } while (Opcion != 2);

    subTotal = subTotal + pago + roomprice;
    Iva = subTotal * 0.21;
    total = subTotal + Iva;
    discount = total * 0.1;   //Discount por pag more than $4000

        // Discounts percents
        if (payMethod == 1){
               discountPayMethod =total *0.20;

        }else if(payMethod == 2){
            discountPayMethod =total *0.15;

        }else if(payMethod == 3){
              discountPayMethod = total * 0.1;

        }else{
            discountPayMethod = 0;
        }


    if (total >= 4000 && discountPayMethod >0) { //For payments greather than $4000 and a discount for the pay method
        System.out.println
                ("\n\n\033[34m//--------------------------BILL-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nBrute Total:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\nAmount greater than $4000. 10% Desc.:  $ "+ discount
                + "\nDiscount by payment method:            $ "+ discountPayMethod
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mNET TOTAL:                                      $ "+ (total - discount - discountPayMethod)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Thank you for being a guest at the Enterprise hotel."
                + "\n           We look forward to your next visit.\n");


    } else if(total>=4000 && discountPayMethod ==0) {        //For payments greather than $4000 without discount for the pay method
        System.out.println
                 ("\n\n\033[34m//--------------------------BILL-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nBrute Total:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\nAmount greater than $4000. 10% Desc.:  $ "+ discount
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mNET TOTAL:                                      $ "+ (total - discount - discountPayMethod)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Thank you for being a guest at the Enterprise hotel."
                + "\n           We look forward to your next visit.\n");


    } else if (discountPayMethod>0){ //For payments less than $4000 with discount for the pay method
        System.out.println
                 ("\n\n\033[34m//--------------------------BILL-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nBrute Total:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\nDiscount by payment method:            $ "+ discountPayMethod
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mNET TOTAL:                                      $ "+ (total - discount - discountPayMethod)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Thank you for being a guest at the Enterprise hotel."
                + "\n           We look forward to your next visit.\n");





        } else {
        System.out.println   //For payments without any discount
                 ("\n\n\033[34m//--------------------------BILL-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nBrute Total:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mNET TOTAL:                                      $ "+ (total - discount - discountPayMethod)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Thank you for being a guest at the Enterprise hotel."
                + "\n           We look forward to your next visit.\n");
    }

}

}
