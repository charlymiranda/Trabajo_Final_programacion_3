package com.hotelenterprise.hotel;


import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.client.Guest;
import com.hotelenterprise.services.Product;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Room implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int roomNumber;
    private Client client;
    private String typeOfRoom;
    private List<Guest> guestList = new ArrayList<>();
    private String description;
    private boolean occupied;
    private double costPerNight;
    private List<Product> consumptions;


    public Room() {
    }

    public Room(int roomNumber, String description, boolean occupied) {
        this.roomNumber = roomNumber;
        this.description = description;
        this.occupied = occupied;
    }

    public Room(int roomNumber, Client client, List<Guest> guestList, String description, boolean occupied) {
        this.roomNumber = roomNumber;
        this.client = client;
        this.guestList = guestList;
        this.description = description;
        this.occupied = occupied;

    }
    public String getTypeOfRoom() {
        return typeOfRoom;
    }

    public void setTypeOfRoom(String typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Guest> getGuestList() {
        return guestList;
    }

    public void setGuestList(List<Guest> guestList) {
        this.guestList = guestList;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isOccupied() {
        return occupied;
    }

    public void setOccupied(boolean occupied) {
        this.occupied = occupied;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public double getCostPerNight() {
        return costPerNight;
    }

    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }

    public List<Product> getLoadsCharged() {
        return this.consumptions;
    }

    public void setLoadsCharged(List<Product> loadsCharged) {
       consumptions = loadsCharged;
    }
    public void setLoadsCharged(Product product){
        consumptions.add(product);
    }


}
