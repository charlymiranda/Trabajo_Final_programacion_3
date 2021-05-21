package com.hotelenterprise.users;

public class Client extends User{
    private int idReservation;
    private int roomNumber;

    public Client(String name, String lastname, String docType, String docNumber,
                  String telephone, String address, String eMail, int idReservation, int roomNumber) {
        super(name, lastname, docType, docNumber, telephone, address, eMail);
        this.idReservation = idReservation;
        this.roomNumber = roomNumber;
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
