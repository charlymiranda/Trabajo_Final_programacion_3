package com.hotelenterprise.person.client;

import com.hotelenterprise.utilities.Console;

import java.io.Serializable;
import java.nio.file.AccessDeniedException;

public class Address implements Serializable {
    private String city;
    private String street;
    private String streetNumber;
    private String departament;
    private String floor;

    public Address() {
    }

    public Address(String city, String street, String streetNumber, String departament, String floor) {
        this.city = city;
        this.street = street;
        this.streetNumber = streetNumber;
        this.departament = departament;
        this.floor = floor;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public String getDepartament() {
        return departament;
    }

    public void setDepatament(String depatament) {
        this.departament = depatament;
    }

    public String getFloor() {
        return floor;
    }

    public void setFloor(String floor) {
        this.floor = floor;
    }



    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", streetNumber='" + streetNumber + '\'' +
                ", depatament='" + departament + '\'' +
                ", floor='" + floor + '\'' +
                '}';
    }
}
