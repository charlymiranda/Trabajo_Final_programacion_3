package com.hotelenterprise.person.client;

import com.hotelenterprise.functionality.DocumentType;
import com.hotelenterprise.person.Person;
import com.hotelenterprise.utilities.Console;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Client extends Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private int idReservation;
    private int roomNumber;
    private List<Guest> guestList = new ArrayList<>();


    public Client() {
    }

    public Client(String name, String lastname, String docType, String docNumber, String telephone, Address address,
                  String eMail, int idReservation, int roomNumber, List<Guest> guestList) {
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

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    @Override
    public String toString() {
        return "Client{" + super.toString() +
                "idReservation=" + idReservation +
                ", roomNumber=" + roomNumber +
                '}';
    }
}
