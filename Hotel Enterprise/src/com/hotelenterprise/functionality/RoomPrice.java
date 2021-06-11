package com.hotelenterprise.functionality;

import com.hotelenterprise.menu.Colours;

public final class RoomPrice {
    public static final double SINGLE = 1000;
    public static final double DOUBLE = 1500;
    public static final double TRIPLE = 2000;
    public static final double QUADRUPLE = 2500;
   // public static final double QUINTUPLE= 3500;

    public RoomPrice() {
    }

    public static void typeofRoom() {

        Colours color = new Colours();

        System.out.println("\33[33m1.-" + color.b + " Single" +
                "\n\33[33m2.-" + color.b + " Double" +
                "\n\33[33m3.-" + color.b + " Triple" +
                "\n\33[33m4.-" + color.b + " Quadruple");
    }


}
