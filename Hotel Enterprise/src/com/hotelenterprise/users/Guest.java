package com.hotelenterprise.users;

public class Guest extends Person{
    private int roomNumber;

    public Guest(String name, String lastname, String docType, String docNumber, String telephone, String address, String eMail, int roomNumber) {
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
        return "Guests{" +
                "roomNumber=" + roomNumber +
                '}';
    }
}
