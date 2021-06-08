package com.hotelenterprise.hotel;

import com.hotelenterprise.file.FileManagement;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.services.Product;
import org.w3c.dom.ls.LSInput;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Hotel {

    List<Room> roomList = new ArrayList<>();
    List<Client> clientList = new ArrayList<>();
    List<Reservation> reservationList = new ArrayList<>();
    List<Reservation>  pastReservations = new ArrayList<>();
    List<Product> productList = new ArrayList<>();


    public static final String CLIENTE_FILE="Hotel Enterprise\\src\\com\\hotelenterprise\\hotel\\Clients.json";
    public static final String ROOM_FILE="Hotel Enterprise\\src\\com\\hotelenterprise\\hotel\\Room.json";
    public static final String RESERVATIONS_FILE="Hotel Enterprise\\src\\com\\hotelenterprise\\hotel\\Reservation.json";
    public static final String PAST_RESERVATIONS_FILE="Hotel Enterprise\\src\\com\\hotelenterprise\\hotel\\PastReservations.json";

    public Hotel() {
    }

    public Hotel(List<Room> roomList, List<Client> clientList, List<Reservation> reservationList, List<Reservation> pastReservations) {
        this.roomList = roomList;
        this.clientList = clientList;
        this.reservationList = reservationList;
        this.pastReservations = pastReservations;
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

    public List<Reservation> getPastReservations() {
        return pastReservations;
    }

    public void setPastReservations(List<Reservation> pastReservations) {
        this.pastReservations = pastReservations;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public static String getClienteFile() {
        return CLIENTE_FILE;
    }

    public static String getRoomFile() {
        return ROOM_FILE;
    }

    public static String getReservationsFile() {
        return RESERVATIONS_FILE;
    }

    public static String getPastReservationsFile() {
        return PAST_RESERVATIONS_FILE;
    }

    public void readFromJsonFile(){

        List<Object> clientsObjects= FileManagement.readJsonFile(CLIENTE_FILE);
        for (Object o: clientsObjects){
            this.clientList.add((Client) o);
        }
        List<Object> reservationObjects = FileManagement.readJsonFile(RESERVATIONS_FILE);
        for(Object o: reservationObjects){
            this.reservationList.add((Reservation) o);
        }
        List<Object> roomsObjects = FileManagement.readJsonFile(ROOM_FILE);
        for(Object o: roomsObjects){
            this.roomList.add((Room) o);
        }
        List<Object> pastReservationsObjects = FileManagement.readJsonFile(PAST_RESERVATIONS_FILE);
        for (Object o: pastReservationsObjects){
            this.pastReservations.add((Reservation) o);
        }
    }

    public void writeToJsonFile(){


    }


    public Room searchForFreeRoom() {

        for (Room room : roomList) {

            if (!room.isOccupied()) {

                System.out.println("The room is free");

                return room;
            }

        }
        return null;
    }

    public Room searchForFreeRoomandType() {

        for (Room room : roomList) {

            if (!room.isOccupied() && room.getTypeOfRoom().equals(TypeOfRoom.SINGLE) ) {

                System.out.println("The room single is free");

                return room;
            }

        }
        return null;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "roomList=" + roomList +
                ", clientList=" + clientList +
                ", reservationList=" + reservationList +
                '}';
    }


}
