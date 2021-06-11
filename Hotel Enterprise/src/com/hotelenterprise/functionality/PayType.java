package com.hotelenterprise.functionality;

import com.hotelenterprise.menu.Colours;

public final class PayType {

    public static final String CASH = "Cash";
    public static final String MARKETPAY = "Mercado Pago";
    public static final String BANKTRANSFER = "Bank Transfer";
    public static final String DEBITCARD = "Debit Card";
    public static final String CREDITCARD = "Credit Card";
    public static final String CHEQ = "Check";
    public static final String ECHEQ = "Electronic Check";
    public static final String CRIPTOCURRENCIES = "Cripto Currencies";

    public PayType() {
    }

    public static void typeofpay(){
        Colours color = new Colours();

        System.out.println
                          ("\33[33m1.-" + color.b + " Cash" +
                         "\n\33[33m2.-" + color.b + " Mercado Pago" +
                         "\n\33[33m3.-" + color.b + " Bank Transfer" +
                         "\n\33[33m4.-" + color.b + " Debit Cardr" +
                         "\n\33[33m5.-" + color.b + " Credit Card" +
                         "\n\33[33m6.-" + color.b + " Check" +
                         "\n\33[33m7.-" + color.b + " Electronic Check" +
                         "\n\33[33m8.-" + color.b + " Cripto Currencies" );

    }
}
