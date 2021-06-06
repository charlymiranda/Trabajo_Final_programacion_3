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
    double roomprice, precio, subTotal = 0, pago, total, Iva, descuento, descuentoFdepago;
    int Cantidad, Opcion;
    Scanner Prod = new Scanner(System.in);
    Colours color = new Colours();



    do {
        System.out.println("\nIngrese el tipo de habitación a abonar");

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


        System.out.println("\nIngrese la cantidad de productos cargados a la habitación ");
        Cantidad = Prod.nextInt();
        precio = ProductPrice.GENERALPRICE; //Prod.nextDouble(); Habria que traer la cantidad de productos cargados de otro lado tambien
        pago = Cantidad * precio;

        System.out.println("\nIngrese el formato de pago ");

        PayType.typeofpay();
        payMethod= Console.readInteger();

        if (payMethod == 1){
            System.out.println("\n\033[34mRecibe 20% de descuento por pago contado " + "\033[34m" + color.b);

        }else if(payMethod == 2){
            System.out.println("\n\033[34mRecibe 15% descuento por Mercado Pago " + "\033[34m" + color.b);

        }else if(payMethod == 3){
            System.out.println("\n\033[34mRecibe 10% descuento por Transferencia bancaria " + "\033[34m" + color.b);

        }else{
            //System.out.println("\n\033[35mNo recibe descuento "  + color.b);   // Ver con Charly cual de las dos queda mejor
            color.colorearMensaje(color.red, "No recibe descuento");
        }



        System.out.println("\n¿Desea agregar otro cargo?"
                + "\n1-Si"
                + "\n2-No");

        Opcion = Prod.nextInt();
        subTotal = subTotal + pago + roomprice;

    } while (Opcion != 2);

    Iva = subTotal * 0.21;
    total = subTotal + Iva;
    descuento = total * 0.1;   //Descuento por pago mayor a $4000

        if (payMethod == 1){
               descuentoFdepago =total *0.20;

        }else if(payMethod == 2){
            descuentoFdepago =total *0.15;

        }else if(payMethod == 3){
              descuentoFdepago = total * 0.1;  // Descuento del 10% por la forma de pagar

        }else{
            descuentoFdepago = 0;
        }


    if (total >= 4000 && descuentoFdepago >0) {
        System.out.println
                ("\n\n\033[34m//-----------------------FACTURA-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nTotal Bruto:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\nDesc. 10% x importe mayor a $ 4000:   $ "+ descuento
                + "\nDescuento por forma de pago:          $ "+ descuentoFdepago
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mTOTAL NETO:                                     $ "+ (total - descuento - descuentoFdepago)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Gracias por haber sido huesped del hotel Enterprise"
                + "\n        Aguardamos con ansias su próxima visita.\n");


    } else if(total>=4000 && descuentoFdepago ==0) {
        System.out.println
                ("\n\n\033[34m//-----------------------FACTURA-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nTotal Bruto:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\nDesc. 10% x importe mayor a $ 4000:   $ "+ descuento
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mTOTAL NETO:                                     $ "+ (total - descuento - descuentoFdepago)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Gracias por haber sido huesped del hotel Enterprise"
                + "\n        Aguardamos con ansias su próxima visita.\n");


    } else if (descuentoFdepago>0){
        System.out.println
                 ("\n\n\033[34m//-----------------------FACTURA-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nTotal Bruto:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\nDescuento por forma de pago:          $ "+ descuentoFdepago
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mTOTAL NETO:                                     $ "+ (total - descuento - descuentoFdepago)
                + "\n\033[34m----------------------------------------------------------" +color.b
                + "\n\n   Gracias por haber sido huesped del hotel Enterprise"
                + "\n        Aguardamos con ansias su próxima visita.\n");




        } else {
        System.out.println
                ("\n\n\033[34m//-----------------------FACTURA-------------------------\\\\" + color.b
                + "\n\nSubTotal:                                       $ "+ subTotal
                + "\n\033[31mIva:                                            $ "+ Iva + color.b
                + "\nTotal Bruto:                                    $ "+ total
                + "\n----------------------------------------------------------"
                + "\n\n\033[34m----------------------------------------------------------"
                + "\n\033[34mTOTAL NETO:                                     $ "+ (total - descuento - descuentoFdepago)
                + "\n\033[34m----------------------------------------------------------"+color.b
                + "\n\n   Gracias por haber sido huesped del hotel Enterprise"
                + "\n        Aguardamos con ansias su próxima visita.\n");

    }

}

}
