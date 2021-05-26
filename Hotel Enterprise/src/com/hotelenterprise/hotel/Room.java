package com.hotelenterprise.hotel;


import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.users.Client;
import com.hotelenterprise.users.Guest;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Room implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;
    private int roomNumber;
    private Client client;
    private List<Guest> guestList = new ArrayList<>();
    private String description;
    private boolean occupied;
    private int maximumNumberOfPassengers;

    public Room() {
    }

    public Room(int roomNumber, String description, boolean occupied, int maximumNumberOfPassengers) {
        this.roomNumber = roomNumber;
        this.description = description;
        this.occupied = occupied;
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }

    public Room(int roomNumber, Client client, List<Guest> guestList, String description, boolean occupied, int maximumNumberOfPassengers) {
        this.roomNumber = roomNumber;
        this.client = client;
        this.guestList = guestList;
        this.description = description;
        this.occupied = occupied;
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
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

    public int getMaximumNumberOfPassengers() {
        return maximumNumberOfPassengers;
    }

    public void setMaximumNumberOfPassengers(int maximumNumberOfPassengers) {
        this.maximumNumberOfPassengers = maximumNumberOfPassengers;
    }
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

}
