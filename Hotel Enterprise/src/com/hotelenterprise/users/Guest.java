package com.hotelenterprise.users;

public class Guest {
    private int roomNumber;

    public Guest(int roomNumber) {
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
