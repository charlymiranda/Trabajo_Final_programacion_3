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

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Recepcionist extends Employee implements Serializable, INewReservations {
    @Serial
    private static final long serialVersionUID = 1L;



    public Recepcionist() {

    }

    public Recepcionist(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail,
                        int idEmployee, String permissions, String userName, String password, boolean status) {
        super(name, lastname, docType, docNumber, telephone, address, eMail, idEmployee, permissions, userName, password, status);
    }


    @Override
    public void newBook(Hotel hotel) {
        LocalDate localDate = null;
        Reservation reservation = new Reservation();
        Client client = new Client();
        reservation.setReservationNumber(hotel.lastReservationNumber());
        // System.out.println("Ingrese la fecha de check in (Formato aaaa-mm-dd)");
        //String date = Console.read();

        // reservation.setCheckIn(LocalDate.parse(date));
        //System.out.println("Ingrese la fecha de check out (Formato aaaa-mm-dd)");
        //date = Console.read();
        //reservation.setCheckOut(LocalDate.parse(date));
        client = uploadClientInformation();

        client.setGuestList(uploadGuestInformation());
        loadingRooms(client, reservation);
        hotel.setReservationList(reservation);


    }

    @Override
    public Client uploadClientInformation() {

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


        return client;
    }

    @Override
    public Address setAddressInformation() {
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

        return address;
    }

    @Override
    public List<Guest> uploadGuestInformation() {
        //DocumentType doc = new DocumentType();
        System.out.println("Ingrese la cantidad total de pasajeros");
        int guests = Console.readInteger();
        System.out.println("Primero cargue los datos del cliente principal");
        List<Guest> guestList = new ArrayList<>();
        for (int i = 0; i < guests; i++) {
            Guest guest = new Guest();
            System.out.println("cargando datos del invitados " + (i + 1));
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

    @Override
    public void loadingRooms(Client client, Reservation reservation) {/// ver si le mandamos la lista de clientes par asignar
        List<Room> roomList = new ArrayList<>();
        List<Guest> guestToRemove = client.getGuestList();
        ;
        Guest cGuest = new Guest();
        int choice = 0;
        System.out.println("Ingrese el total de habitaciones para cargar");
        int rooms = Console.readInteger();
        if (client != null) {

            for (int i = 1; i < rooms; i++) {
                Room room = new Room();
                System.out.println("Habitaciones cargadas: " + i + " de " + rooms);
                System.out.println("Elija el tipo de habitacion");
                System.out.println("1: SINGLE \n 2: DOBLE: \n 3: TRIPLE: \n 4: CUADRUPLE: \n 0 terminar la carga");
                choice = Console.readInteger();
                loadingSingleRoom(choice, guestToRemove, room);
                roomList.add(room);
            }
        }
        reservation.setTypesOfRooms(roomList);
    }

    @Override
    public void loadingSingleRoom(int choice, List<Guest> guestToRemove, Room room) {

        if (choice == 1) {
            room.setTypeOfRoom(TypeOfRoom.SINGLE);
            room.setDescription(RoomType.SINGLE);
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            loadingGuestToRooms(guestToRemove, 1, room);
            room.setCostPerNight(RoomPrice.SINGLE);

        } else if (choice == 2) {
            room.setTypeOfRoom(TypeOfRoom.DOUBLE);
            room.setDescription(RoomType.DOUBLE);
            System.out.println("HAbitaciones: ");
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            System.out.println("Loading single room test");
            loadingGuestToRooms(guestToRemove, 2, room);

            room.setCostPerNight(RoomPrice.DOUBLE);

        } else if (choice == 3) {
            room.setTypeOfRoom(TypeOfRoom.TRIPLE);
            room.setDescription(RoomType.TRIPLE);
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            loadingGuestToRooms(guestToRemove, 3, room);
            room.setCostPerNight(RoomPrice.TRIPLE);
        } else if (choice == 4) {
            room.setTypeOfRoom(TypeOfRoom.QUADRUPLE);
            room.setDescription(RoomType.QUADRUPLE);
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            loadingGuestToRooms(guestToRemove, 4, room);
            room.setCostPerNight(RoomPrice.QUADRUPLE);
        } else {
            System.out.println("Valor ingresado invalido");

        }
        System.out.println("Corte maximo!");


    }

    @Override
    public void loadingGuestToRooms(List<Guest> guestToRemove, int numOfGuest, Room room) {
        int choice = 0;
        for (int i = 0; i < numOfGuest; i++) {
            showGuest(guestToRemove);
            System.out.println("Elija a uno de los pasajeros pasa asignar a la habitacion");
            choice = Console.readInteger();
            Guest guest = new Guest();
            guest = guestToRemove.get(choice);
            room.setGuestList(guest);
            guestToRemove.remove(choice);
        }

    }

    @Override
    public void showGuest(List<Guest> guestList) {
        int i = 1;
        for (Guest g : guestList) {
            System.out.println(i + " : " + g.getName() + " " + g.getLastname());
            i++;
        }
    }

    @Override
    public void cancelReservations(Hotel hotel) {

    }

    @Override
    public String chooseTypeOfDocument() {
        int choice = 0;

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
        } while (choice != 1 || choice != 2 || choice != 3);

        return null;
    }

    @Override
    public void showRoomNumbers() {

        System.out.println("101 \t 102 \t 103 \t 104 \t 105 \t 106 \t 107");
        System.out.println("201 \t 202 \t 203 \t 204 \t 205 \t 206 \t 207");
        System.out.println("301 \t 302 \t 303 \t 304 \t 305 \t 306 \t 307");

    }

    @Override
    public String toString() {
        return "Recepcionist{" + super.toString() +
                '}';
    }


}
