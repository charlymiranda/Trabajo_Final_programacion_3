package com.hotelenterprise.hotel;

import com.hotelenterprise.person.client.Client;

import java.io.Serial;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Reservation {
    @Serial
    private static final long serialVersionUID = 1L;
    private LocalDate reservationDate = LocalDate.now();
    private int reservationNumber;
    private Client client;
    private LocalDate checkIn;
    private LocalDate checkOut;
    private int numberOfPassengers;
    private int numberOfRooms;
    private List<Room> typesOfRooms = new ArrayList<>();
    private double totalCost;


    public Reservation(){

    }

    public Reservation(int reservationNumber, Client client, LocalDate reservationDate, LocalDate checkIn, LocalDate checkOut, int numberOfPassengers,
                       int numberOfRooms, List<Room> typesOfRooms, double totalCost) {

        this.reservationNumber = reservationNumber;
        this.client = client;
        this.reservationDate = reservationDate;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.numberOfPassengers = numberOfPassengers;
        this.numberOfRooms = numberOfRooms;
        this.typesOfRooms = typesOfRooms;
        this.totalCost = totalCost;
    }

    public int getReservationNumber() {
        return reservationNumber;
    }

    public void setReservationNumber(int reservationNumber) {
        this.reservationNumber = reservationNumber;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public LocalDate getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(LocalDate reservationDate) {
        this.reservationDate = reservationDate;
    }

    public LocalDate getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(LocalDate checkIn) {
        this.checkIn = checkIn;
    }

    public LocalDate getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(LocalDate checkOut) {
        this.checkOut = checkOut;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public List<Room> getTypesOfRooms() {
        return typesOfRooms;
    }

    public void setTypesOfRooms(List<Room> typesOfRooms) {
        this.typesOfRooms = typesOfRooms;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "reservationNumber=" + reservationNumber +
                ", client=" + client +
                ", reservationDate=" + reservationDate +
                ", checkIn=" + checkIn +
                ", checkOut=" + checkOut +
                ", numberOfPassengers=" + numberOfPassengers +
                ", numberOfRooms=" + numberOfRooms +
                ", typesOfRooms=" + typesOfRooms +
                ", totalCost=" + totalCost +
                '}';
    }
}
