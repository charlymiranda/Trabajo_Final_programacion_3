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
    private TypeOfRoom typeOfRoom;
    private List<Guest> guestList = new ArrayList<>();
    private String description;
    private boolean occupied;
    private double costPerNight;
    private List<Product> consumptions;


    public Room() {
    }

    public Room(int roomNumber, TypeOfRoom typeOfRoom, String description, boolean occupied, double costPerNight) {
        this.roomNumber = roomNumber;
        this.typeOfRoom = typeOfRoom;
        this.description = description;
        this.occupied = occupied;
        this.costPerNight = costPerNight;
    }

    public Room(int roomNumber, Client client, TypeOfRoom typeOfRoom, List<Guest> guestList, String description, boolean occupied,
                double costPerNight, List<Product> consumptions) {
        this.roomNumber = roomNumber;
        this.client = client;
        this.typeOfRoom = typeOfRoom;
        this.guestList = guestList;
        this.description = description;
        this.occupied = occupied;
        this.costPerNight = costPerNight;
        this.consumptions = consumptions;
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

    public void setGuestList(Guest guest) {
        this.guestList.add(guest);
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

    public List<Product> getConsumptions() {
        return consumptions;
    }

    public void setConsumptions(List<Product> consumptions) {
        this.consumptions = consumptions;
    }

    public void setTypeOfRoom(TypeOfRoom typeOfRoom) {
        this.typeOfRoom = typeOfRoom;
    }

    public TypeOfRoom getTypeOfRoom() {
        return typeOfRoom;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", client=" + client +
                ", typeOfRoom=" + typeOfRoom +
                ", guestList=" + guestList +
                ", description='" + description + '\'' +
                ", occupied=" + occupied +
                ", costPerNight=" + costPerNight +
                ", consumptions=" + consumptions +
                '}';
    }
}
