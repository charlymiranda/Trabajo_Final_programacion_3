package com.hotelenterprise.hotel;

import com.hotelenterprise.file.FileManagement;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.person.Person;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.user.Administrator;
import com.hotelenterprise.person.user.Employee;
import com.hotelenterprise.person.user.Recepcionist;
import com.hotelenterprise.services.Product;
import com.hotelenterprise.utilities.Console;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hotel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private List<Room> roomList = new ArrayList<>();
    private List<Client> clientList = new ArrayList<>();
    private List<Reservation> reservationList = new ArrayList<>();
    private List<Reservation> pastReservations = new ArrayList<>();
    private List<Product> productList = new ArrayList<>();
    private List<Reservation> reservationCanceled = new ArrayList<>();
    private List<Recepcionist> recepcionist = new ArrayList<>();
    private List<Administrator> administrator = new ArrayList<>();

    private List<Room> occupiedRooms = new ArrayList<>();


    public static final String CLIENTE_FILE = "\\Hotel Enterprise\\DataFiles\\Clients.json";
    public static final String ROOM_FILE = "\\Hotel Enterprise\\DataFiles\\Room.json";
    public static final String RESERVATIONS_FILE = "\\Hotel Enterprise\\DataFiles\\Reservation.json";
    public static final String PAST_RESERVATIONS_FILE = "\\Hotel Enterprise\\DataFiles\\PastReservations.json";
    public static final String PRODUCTS_FILE = "\\Hotel Enterprise\\DataFiles\\PastReservations.json";
    public static final String RESERVATION_CANCELED = "\\Hotel Enterprise\\DataFiles\\ReservationsCanceled.json";

    public Hotel() {

    }

    public Hotel(List<Room> roomList, List<Client> clientList, List<Reservation> reservationList, List<Reservation> pastReservations, List<Product> productList, List<Reservation> reservationCanceled, List<Recepcionist> recepcionist, List<Administrator> administrator) {
        this.roomList = roomList;
        this.clientList = clientList;
        this.reservationList = reservationList;
        this.pastReservations = pastReservations;
        this.productList = productList;
        this.reservationCanceled = reservationCanceled;
        this.recepcionist = recepcionist;
        this.administrator = administrator;

    }



    public List<Recepcionist> getRecepcionist() {
        return recepcionist;
    }

    public void setRecepcionist(Recepcionist rece) {
        this.recepcionist.add(rece);
    }

    public List<Administrator> getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Administrator admin) {
        this.administrator.add(admin);
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

    public int lastReservationNumber() {
        int num = 1;
        // Reservation rsv= new Reservation();
        if (this.reservationList == null) {
            return num;
        } else {
            for (Reservation rsv : this.reservationList) {
                if (rsv == null) {
                    break;
                } else {
                    num = rsv.getReservationNumber();
                }
            }
        }
        return num + 1;
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

    public static String getClientFile() {
        return CLIENT_FILE;
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

    public List<Reservation> getReservationCanceled() {
        return reservationCanceled;
    }

    public void setReservationCanceled(List<Reservation> reservationCanceled) {
        this.reservationCanceled = reservationCanceled;
    }

    public void setReservationCanceled(Reservation reservationCanceled) {
        this.reservationCanceled.add(reservationCanceled);
    }

    public void readFromJsonFile() {

        List<Object> clientsObjects = FileManagement.readJsonFile(CLIENTE_FILE);
        for (Object o : clientsObjects) {
            this.clientList.add((Client) o);
        }
        List<Object> reservationObjects = FileManagement.readJsonFile(RESERVATIONS_FILE);
        for (Object o : reservationObjects) {
            this.reservationList.add((Reservation) o);
        }
        List<Object> roomsObjects = FileManagement.readJsonFile(ROOM_FILE);
        for (Object o : roomsObjects) {
            this.roomList.add((Room) o);
        }
        List<Object> pastReservationsObjects = FileManagement.readJsonFile(PAST_RESERVATIONS_FILE);
        for (Object o : pastReservationsObjects) {
            this.pastReservations.add((Reservation) o);
        }
        List<Object> productsObjects = FileManagement.readJsonFile(PRODUCTS_FILE);
        for (Object o : productsObjects) {
            this.productList.add((Product) o);
        }
        List<Object> reservationsCanceled = FileManagement.readJsonFile(RESERVATION_CANCELED);
        for (Object o : reservationsCanceled) {
            this.reservationCanceled.add((Reservation) o);
        }
    }

    public void writeIntoJsonFile() {
        FileManagement.writeJsonFile(Collections.singletonList(this.clientList), CLIENTE_FILE);
    public void writeReservation(){
        FileManagement.writeJsonFile(Collections.singletonList(this.reservationList), RESERVATIONS_FILE);

    }

    public void writeIntoJsonFile(){
        FileManagement.writeJsonFile(Collections.singletonList(this.clientList), CLIENT_FILE);

        FileManagement.writeJsonFile(Collections.singletonList(this.roomList), ROOM_FILE);

        //FileManagement.writeJsonFile(Collections.singletonList(this.reservationList), RESERVATIONS_FILE);

        //FileManagement.writeJsonFile(Collections.singletonList(this.pastReservations), PAST_RESERVATIONS_FILE);

        FileManagement.writeJsonFile(Collections.singletonList(this.productList), PRODUCTS_FILE);
    }

    public int searchForFreeRoom() {
        Colours color = new Colours();
        int select = 0;
        int aux = 0;
        System.out.println("Search for the room you needed");
        do {
            System.out.println
                    ("\n\33[34m1.-" + color.b + " \33[34mSingle Room" + color.b +
                            "\n\33[34m2.-" + color.b + " \33[34mDouble Room" + color.b +
                            "\n\33[34m3.-" + color.b + " \33[34mTriple Room" + color.b +
                            "\n\33[34m4.-" + color.b + " \33[34mQuadruple room" + color.b);

            select = Console.readInteger();

            switch (select) {
                case 1:
                    System.out.println("Single Room");
                    aux = searchForFreeRoomAndType(TypeOfRoom.SINGLE);
                    break;
                case 2:
                    System.out.println("Double Room");
                    aux = searchForFreeRoomAndType(TypeOfRoom.DOUBLE);
                    break;
                case 3:
                    System.out.println("Triple Room");
                    aux = searchForFreeRoomAndType(TypeOfRoom.TRIPLE);
                    break;
                case 4:
                    System.out.println("Quadruple Room");
                    aux = searchForFreeRoomAndType(TypeOfRoom.QUADRUPLE);
                    break;
                default:
                    System.out.println("\033[31mIm trully sorry, this option is not allowed...yet" + color.b);
            }
        } while (select == 1 && select == 2 && select == 3 && select == 4);

        return aux;
    }

    public int searchForFreeRoomAndType(TypeOfRoom typeOfRoom) {

        for (Room room : this.roomList) {

            if (!room.isOccupied() && room.getTypeOfRoom().equals(typeOfRoom)) {

                return roomList.indexOf(room);
            }

        }
        return 0;
    }


    public void checkOut(){
        int choice =0;
        listOfOccupiedRooms();
        System.out.println("Ingrese numerode hab para el checkout");
        choice = Console.readInteger();
        if(choice<0) {
            this.occupiedRooms.remove(choice - 1);
        }else{
            System.out.println("Error! debe ingresar un numero correcto.");
        }
    }
    public void listOfOccupiedRooms(){

        for(Room room: this.occupiedRooms){
            System.out.println("Room number: " + room.getRoomNumber());
            System.out.println("Client: " + room.getClient().getLastname());
        }
    }


    public void checkIn(){
        int choice=0;
        for(Reservation r: this.reservationList){
            if(r.getCheckIn().equals(LocalDate.now())){
                System.out.println("Check in: " + r.getCheckIn());
                System.out.println("Cliente: " + r.getClient().getLastname());
            }
        }

        System.out.println("Elija una reserva para hacer el checkIn: ");
        choice = Console.readInteger();

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
