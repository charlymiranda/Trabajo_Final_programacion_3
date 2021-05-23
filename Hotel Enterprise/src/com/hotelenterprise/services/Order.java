package com.hotelenterprise.services;

import java.util.List;

public class Order {
    private int orderID;
    private double orderPrice;
    private String orderStatus;

    //private List Produc tList<Product>;


    public Order() {
    }

    public Order(int orderID, double orderPrice, String orderStatus) {
        this.orderID = orderID;
        this.orderPrice = orderPrice;
        this.orderStatus = orderStatus;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public double getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(double orderPrice) {
        this.orderPrice = orderPrice;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", orderPrice=" + orderPrice +
                ", orderStatus='" + orderStatus + '\'' +
                '}';
    }
}
