package com.hotelenterprise.person.client;

import com.hotelenterprise.person.Person;

import java.io.Serializable;

public class Guest extends Person implements Serializable {
    private int roomNumber;

    public Guest() {
    }

    public Guest(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail, int roomNumber) {
        super(name, lastname, docType, docNumber, telephone, address, eMail);
        this.roomNumber = roomNumber;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }



    @Override
    public String toString() {
        return "Guests{" + super.toString() +
                "roomNumber=" + roomNumber +
                '}';
    }
}
