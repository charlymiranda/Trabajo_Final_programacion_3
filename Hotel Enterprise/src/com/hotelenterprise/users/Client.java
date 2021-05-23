package com.hotelenterprise.users;

import java.util.ArrayList;
import java.util.List;

public class Client extends Person {
    private int idReservation;
    private int roomNumber;
    private List<Guest> guestList = new ArrayList<>();

    public Client(String name, String lastname, String docType, String docNumber, String telephone, String address, String eMail,
                  int idReservation, int roomNumber, List<Guest> guestList) {
        super(name, lastname, docType, docNumber, telephone, address, eMail);
        this.idReservation = idReservation;
        this.roomNumber = roomNumber;
        this.guestList = guestList;
    }

    public int getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(int idReservation) {
        this.idReservation = idReservation;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString() +
                "idReservation=" + idReservation +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
