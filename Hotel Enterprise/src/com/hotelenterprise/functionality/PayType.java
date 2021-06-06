package com.hotelenterprise.functionality;

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

        System.out.println("1. Cash");
        System.out.println("2. Mercado Pago");
        System.out.println("3. Bank Transfer");
        System.out.println("4. Debit Card");
        System.out.println("5. Credit Card");
        System.out.println("6. Check");
        System.out.println("7. Electronic Check");
        System.out.println("8. Cripto Currencies");

    }
}
