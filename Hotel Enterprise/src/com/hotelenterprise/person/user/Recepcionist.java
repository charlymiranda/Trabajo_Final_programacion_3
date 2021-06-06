package com.hotelenterprise.person.user;

import com.hotelenterprise.functionality.DocumentType;
import com.hotelenterprise.functionality.RoomPrice;
import com.hotelenterprise.functionality.RoomType;
import com.hotelenterprise.functionality.TypeOfRoom;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Reservation;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.client.Guest;
import com.hotelenterprise.utilities.Console;

import java.sql.SQLOutput;
import java.time.*;

import java.util.*;



public class Recepcionist extends Employee {

    private String Schedule;
    private List<Reservation> salesRecord = new ArrayList<>();

    public Recepcionist(){

    }

    public Recepcionist(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail,
                        int idEmployee, String permissions, String userName, String password, boolean status, String schedule,
                        List<Reservation> salesRecord) {
        super(name, lastname, docType, docNumber, telephone, address, eMail, idEmployee, permissions, userName, password, status);
        Schedule = schedule;
        this.salesRecord = salesRecord;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public List<Reservation> getSalesRecord() {
        return salesRecord;
    }

    public void setSalesRecord(List<Reservation> salesRecord) {
        this.salesRecord = salesRecord;
    }


    public void newBook(){

        Reservation reservation = new Reservation();
        Hotel hotel = new Hotel();
        Client client = new Client();
        reservation.setReservationNumber(hotel.lastReservationNumber());
        System.out.println("Ingrese la fecha de check in (Formato aaaa-mm-dd)");
        String date = Console.read();
        reservation.setCheckIn(LocalDate.parse(date));
        System.out.println("Ingrese la fecha de check out (Formato aaaa-mm-dd)");
        date=Console.read();
        reservation.setCheckOut(LocalDate.parse(date));
        client = uploadClientInformation();
        loadingRooms(client, reservation);


    }

    public Client uploadClientInformation(){

        DocumentType doc = new DocumentType();
        Client client = new Client();
        Address address = new Address();
        System.out.println("Ingrese los datos del cliente");
        System.out.println("Ingrese el nombre");
        client.setName(Console.read());
        System.out.println("Ingrese el Apellido");
        client.setLastname(Console.read());
        System.out.println("Ingrese el tipo de documento");
        client.setDocType(chooseTypeOfDocument());
        System.out.println("Ingrese el numero del documento");
        client.setDocNumber(Console.read());
        System.out.println("Ingrese el telefono");
        client.setTelephone(Console.read());
        System.out.println("Ingrese el Email");
        client.seteMail(Console.read());
        System.out.println("Ingrese la direccion");
        client.setAddress(setAddressInformation());
        System.out.println("Ingrese la cantidad de pasajeros");
        int numOfGuest = Console.readInteger();
        client.setGuestList(uploadGuestInformation(numOfGuest));

        return client;
    }
    public Address setAddressInformation(){
        Address address = new Address();
        System.out.println("Ciudad");
        address.setCity(Console.read());
        System.out.println("Calle");
        address.setStreet(Console.read());
        System.out.println("Numero");
        address.setStreetNumber(Console.read());
        System.out.println("Departamento");
        address.setDepatament(Console.read());
        System.out.println("Piso");
        address.setFloor(Console.read());

        return  address;
    }
    public List<Guest> uploadGuestInformation(int guests){
        //DocumentType doc = new DocumentType();
        Guest guest = new Guest();
        List<Guest> guestList = new ArrayList<>();
        for(int i=0; i<guests; i++){
            System.out.println("cargando datos del invitados");
            System.out.println("Ingrese el nombre");
            guest.setName(Console.read());
            System.out.println("Ingrese el apellido");
            guest.setLastname(Console.read());
            System.out.println("Tipo de documento");
            guest.setDocType(chooseTypeOfDocument());
            System.out.println("Numero de documento");
            guest.setDocNumber(Console.read());
            guestList.add(guest);
        }

        return guestList;
    }
    public void loadingRooms(Client client, Reservation reservation){/// ver si le mandamos la lista de clientes par asignar
        List<Room> roomList = new ArrayList<>();
        List<Guest> guestToRemove = client.getGuestList();
        Room room = new Room();
        int choice =0;
        System.out.println("Ingrese el total de habitaciones para cargar");
        int rooms = Console.readInteger();

            for (int i = 0; i < rooms; i++) {
                System.out.println("Habitaciones cargadas: " + i + " de " + rooms);
                System.out.println("Elija el tipo de habitacion");
                System.out.println("1: SINGLE \n 2: DOBLE: \n 3: TRIPLE: \n 4: CUADRUPLE: \n 0 terminar la carga");
                choice = Console.readInteger();

                if (choice == 1) {
                    room.setTypeOfRoom(String.valueOf(TypeOfRoom.SINGLE));
                    room.setDescription(RoomType.SINGLE);
                    showRoomNumbers();
                    room.setRoomNumber(Console.readInteger());
                    guestToRemove=loadingGuestToRooms(guestToRemove, 1, room);
                    room.setCostPerNight(RoomPrice.SINGLE);

                } else if (choice == 2) {
                    room.setTypeOfRoom(String.valueOf(TypeOfRoom.DOUBLE));
                    room.setDescription(RoomType.DOUBLE);
                    showRoomNumbers();
                    room.setRoomNumber(Console.readInteger());
                    guestToRemove= loadingGuestToRooms(guestToRemove, 2, room);
                    room.setCostPerNight(RoomPrice.DOUBLE);

                } else if (choice == 3) {
                    room.setTypeOfRoom(String.valueOf(TypeOfRoom.TRIPLE));
                    room.setDescription(RoomType.TRIPLE);
                    showRoomNumbers();
                    room.setRoomNumber(Console.readInteger());
                    guestToRemove=loadingGuestToRooms(guestToRemove, 3, room);
                    room.setCostPerNight(RoomPrice.TRIPLE);
                } else if (choice == 4) {
                    room.setTypeOfRoom(String.valueOf(TypeOfRoom.QUADRUPLE));
                    room.setDescription(RoomType.QUADRUPLE);
                    showRoomNumbers();
                    room.setRoomNumber(Console.readInteger());
                    guestToRemove=loadingGuestToRooms(guestToRemove, 4, room);
                    room.setCostPerNight(RoomPrice.QUADRUPLE);
                } else if (choice == 0) {
                    i--;
                    break;


                } else {
                    System.out.println("Valor ingresado invalido");
                    i--;
                }
                roomList.add(room);
                room=null;
            }

        reservation.setTypesOfRooms(roomList);
    }

    public String chooseTypeOfDocument(){
        int choice=0;

        do {
            System.out.println("Elija una opcion...");
            System.out.println("1: DNI \n 2: PASAPORTE: \n 3: lIBRETA DE ENROLLAMIENTO");
            choice = Console.readInteger();

            if (choice == 1) {
                return DocumentType.DNI;
            } else if (choice == 2) {
                return DocumentType.PASAPORTE;
            } else if (choice == 3) {
                return DocumentType.LIBRETAENRROLAMIENTO;
            } else {
                System.out.println("Opcion no valida");
            }
        }while (choice!=1 || choice !=2 || choice!=3);

        return null;
    }

    public void showRoomNumbers(){

        System.out.println("101 \t 102 \t 103 \t 104 \t 105 \t 106 \t 107");
        System.out.println("201 \t 202 \t 203 \t 204 \t 205 \t 206 \t 207");
        System.out.println("301 \t 302 \t 303 \t 304 \t 305 \t 306 \t 307");

    }

    public List<Guest> loadingGuestToRooms(List<Guest> guestList, int numOfGuest, Room room){
            int choice=0;
            for(int i=0; i< numOfGuest; i++) {
                showGuest(guestList);
                System.out.println("Elija a uno de los pasajeros pasa asignar a la habitacion");
                choice = Console.readInteger();
                guestList.remove(choice - 1);

            }
        return guestList;
    }

    public void showGuest(List<Guest> guestList){
        int i=1;
        for(Guest g: guestList) {
            System.out.println(i + " : " + g.getName() + " " + g.getLastname());
            i++;
        }
    }

    @Override
    public String toString() {
        return "Recepcionist{" +
                "Schedule='" + Schedule + '\'' +
                ", salesRecord=" + salesRecord +
                '}';
    }


}
