package com.hotelenterprise.services;

import com.hotelenterprise.person.client.Client;

import java.time.LocalDateTime;

public class Paymment {

    private int idPago;
    private Client client;
    private String payMethod;
    private int receipNumber;
    private LocalDateTime paymmentDay;


    public Paymment() {
    }

    public Paymment(int idPago, Client client, String payMethod, int receipNumber) {
        this.idPago = idPago;
        this.client = client;
        this.payMethod = payMethod;
        this.receipNumber = receipNumber;
        this.paymmentDay = LocalDateTime.now();
    }

    public int getIdPago() {
        return idPago;
    }

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String getPayMethod() {
        return payMethod;
    }

    public void setPayMethod(String payMethod) {
        this.payMethod = payMethod;
    }

    public int getReceipNumber() {
        return receipNumber;
    }

    public void setReceipNumber(int receipNumber) {
        this.receipNumber = receipNumber;
    }

    public LocalDateTime getPaymmentDay() {
        return paymmentDay;
    }

    public void setPaymmentDay(LocalDateTime paymmentDay) {
        this.paymmentDay = paymmentDay;
    }

    @Override
    public String toString() {
        return "Paymment{" +
                "idPago=" + idPago +
                ", client=" + client +
                ", payMethod='" + payMethod + '\'' +
                ", receipNumber=" + receipNumber +
                ", paymmentDay=" + paymmentDay +
                '}';
    }
}
