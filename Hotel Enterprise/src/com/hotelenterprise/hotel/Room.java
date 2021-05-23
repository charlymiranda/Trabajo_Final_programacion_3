package com.hotelenterprise.hotel;


import com.hotelenterprise.users.Client;

public class Room {
    private int roomNumber;
    private Client client;
    private String description;
    private boolean occupied;
    private int maximumNumberOfPassengers;

    public Room(int roomNumber, String description, boolean occupied, int maximumNumberOfPassengers) {
        this.roomNumber = roomNumber;
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

    @Override
    public String toString() {
        return "Room{" +
                "roomNumber=" + roomNumber +
                ", description='" + description + '\'' +
                ", occupied=" + occupied +
                ", maximumNumberOfPassengers=" + maximumNumberOfPassengers +
                '}';
    }
}
