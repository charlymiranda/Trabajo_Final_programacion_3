package com.hotelenterprise.hotel;

import com.hotelenterprise.person.client.Client;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> roomList = new ArrayList<>();
    List<Client> clientList = new ArrayList<>();
    List<Reservation> reservationList = new ArrayList<>();
    List<Reservation> reservationsCanceled = new ArrayList<>();

    public Hotel() {
    }

    public Hotel(List<Room> roomList, List<Client> clientList, List<Reservation> reservationList,
                 List<Reservation> reservationsCanceled) {
        this.roomList = roomList;
        this.clientList = clientList;
        this.reservationList = reservationList;
        this.reservationsCanceled = reservationsCanceled;
    }

    public List<Room> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Room> roomList) {
        this.roomList = roomList;
    }

    public void setRoomList(Room room) {
        this.roomList.add(room);
    }

    public List<Client> getClientList() {
        return clientList;
    }

    public void setClientList(List<Client> clientList) {
        this.clientList = clientList;
    }
    public void setClientList(Client client) {
        this.clientList.add(client);
    }

    public List<Reservation> getReservationList() {
        return reservationList;
    }

    public void setReservationList(List<Reservation> reservationList) {
        this.reservationList = reservationList;
    }

    public void setReservationList(Reservation reservation) {
        this.reservationList.add(reservation);
    }

    public List<Reservation> getReservationsCanceled() {
        return reservationsCanceled;
    }

    public void setReservationsCanceled(List<Reservation> reservationsCanceled) {
        this.reservationsCanceled = reservationsCanceled;
    }
    public void setReservationsCanceled(Reservation reservation) {
        this.reservationsCanceled.add(reservation);
    }

    public int lastReservationNumber(){
        int num=1;
       // Reservation rsv= new Reservation();
        if(this.reservationList==null){
            return num;
        }else{
            for (Reservation rsv: this.reservationList) {
                if(rsv==null){
                    break;
                }else{
                    num=rsv.getReservationNumber();
                }
            }
        }
        return num+1;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomList=" + roomList +
                ", clientList=" + clientList +
                ", reservationList=" + reservationList +
                ", reservationsCanceled=" + reservationsCanceled +
                '}';
    }
}
