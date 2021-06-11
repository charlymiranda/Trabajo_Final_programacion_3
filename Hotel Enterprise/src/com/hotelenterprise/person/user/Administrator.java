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

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Administrator extends Employee implements Serializable, INewReservations {

    public Administrator(){

    }

    public Administrator(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail,
                         String permissions, String userName, String password, boolean status) {
        super(name, lastname, docType, docNumber, telephone, address, eMail, permissions, userName, password, status);
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
        hotel.setClientList(client);
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

        return  address;
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
    public void loadingRooms(Client client, Reservation reservation) {
        List<Room> roomList = new ArrayList<>();
        List<Guest> guestToRemove = client.getGuestList();;
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
                loadingSingleRoom(choice, guestToRemove,room);
                roomList.add(room);
                guestToRemove.remove(choice);
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
            guestToRemove = loadingGuestToRooms(guestToRemove, 1, room);
            room.setCostPerNight(RoomPrice.SINGLE);

        } else if (choice == 2) {
            room.setTypeOfRoom(TypeOfRoom.DOUBLE);
            room.setDescription(RoomType.DOUBLE);
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            guestToRemove = loadingGuestToRooms(guestToRemove, 2, room);
            room.setCostPerNight(RoomPrice.DOUBLE);

        } else if (choice == 3) {
            room.setTypeOfRoom(TypeOfRoom.TRIPLE);
            room.setDescription(RoomType.TRIPLE);
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            guestToRemove = loadingGuestToRooms(guestToRemove, 3, room);
            room.setCostPerNight(RoomPrice.TRIPLE);
        } else if (choice == 4) {
            room.setTypeOfRoom(TypeOfRoom.QUADRUPLE);
            room.setDescription(RoomType.QUADRUPLE);
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
            guestToRemove = loadingGuestToRooms(guestToRemove, 4, room);
            room.setCostPerNight(RoomPrice.QUADRUPLE);
        } else {
            System.out.println("Valor ingresado invalido");

        }


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
        }while (choice!=1 || choice !=2 || choice!=3);

        return null;
    }

    @Override
    public void showRoomNumbers() {
        System.out.println("101 \t 102 \t 103 \t 104 \t 105 \t 106 \t 107");
        System.out.println("201 \t 202 \t 203 \t 204 \t 205 \t 206 \t 207");
        System.out.println("301 \t 302 \t 303 \t 304 \t 305 \t 306 \t 307");
    }

    @Override
    public List<Guest> loadingGuestToRooms(List<Guest> guestList, int numOfGuest, Room room) {
        int choice=0;
        for(int i=0; i< numOfGuest; i++) {
            showGuest(guestList);
            System.out.println("Elija a uno de los pasajeros pasa asignar a la habitacion");
            choice = Console.readInteger();
            room.setGuestList(guestList.get(choice));
        }
        return guestList;
    }

    @Override
    public void showGuest(List<Guest> guestList) {
        int i=1;
        for(Guest g: guestList) {
            System.out.println(i + " : " + g.getName() + " " + g.getLastname());
            i++;
        }
    }

    @Override
    public void cancelReservations(Hotel hotel) {
        Reservation aux = new Reservation();
        System.out.println("Ingrese el DNI del cliente dueño de la reserva!");
        String dni = Console.read();
        int position = searchReservation(hotel.getReservationList(), dni);
        if(position==0){
            System.out.println("No hay reserva asignada a ese DNI");
        }else{
            System.out.println("la Reserva fue encontrada: ");
            System.out.println(hotel.getReservationList().get(position).getClient().toString());
            System.out.println("\t Reserva cancelada.");
            hotel.setReservationCanceled(hotel.getReservationList().get(position));
            hotel.getReservationList().remove(position);

        }

    }

    public int searchReservation(List<Reservation> reservations, String dni){
        for (Reservation r: reservations){
            if(r.getClient().getDocNumber().equals(dni)){
                return reservations.indexOf(r);
            }
        }
        return 0;
    }

    public void checkIn(){

    }

    public void searchForRoom(){

    }


    @Override
    public String toString() {
        return "Administrator{}" + super.toString();
    }

    public void createAdministrator()  {

        Administrator admin = new Administrator();
        Employee emple = new Employee();
        Hotel hotel = new Hotel();

        System.out.println("Name: ");
        emple.setName(Console.read());
        System.out.println("Last Name: ");
        emple.setLastname(Console.read());
        System.out.println("Doc Type: ");
        System.out.println("1.- Document. 2.-Passport 3.-Roling Libret");
        emple.setDocType(Console.read());
        System.out.println("Document Number: ");
        emple.setDocNumber(Console.read());
        System.out.println("Telephone Number: ");
        emple.setTelephone(Console.read());
        System.out.println("Address: ");
        Address address = new Address();
        address.setStreet(Console.read());
        System.out.println("E-mail: ");
        emple.seteMail(Console.read());
        System.out.println("Permissions");
        System.out.println("1.- Administrator. 2.-Receptionist.");
        emple.setPermissions(Console.read());
        System.out.println("User: ");
        emple.setUserName(Console.read());
        System.out.println("Paswword: ");
        emple.setPassword(Console.read());
        emple.setStatus(true);

/*
        System.out.println("Name: ");
        admin.setName(Console.read());
        System.out.println("Last Name: ");
        admin.setLastname(Console.read());
        System.out.println("Doc Type: ");
        System.out.println("1.- Document. 2.-Passport 3.-Roling Libret");
        admin.setDocType(Console.read());
        System.out.println("Document Number: ");
        admin.setDocNumber(Console.read());
        System.out.println("Telephone Number: ");
        admin.setTelephone(Console.read());
        System.out.println("Address: ");
        Address address = new Address();
        address.setStreet(Console.read());
        System.out.println("E-mail: ");
        admin.seteMail(Console.read());
        System.out.println("Permissions");
        System.out.println("1.- Administrator. 2.-Receptionist.");
        admin.setPermissions(Console.read());
        System.out.println("User: ");
        admin.setUserName(Console.read());
        System.out.println("Paswword: ");
        admin.setPassword(Console.read());
        admin.setStatus(true);
*/
 //       hotel.setEmployee(emple);
//        hotel.setAdministrator(admin);
        System.out.println("Succes creating new Administrator.");
        System.out.println("\n\n");
    }


    public void createRecepcionist()  {

        Recepcionist rece = new Recepcionist();
        Hotel hotel = new Hotel();

        System.out.println("Name: ");
        rece.setName(Console.read());
        System.out.println("Last Name: ");
        rece.setLastname(Console.read());
        System.out.println("Doc Type: ");
        System.out.println("1.- Document. 2.-Passport 3.-Roling Libret");
        rece.setDocType(Console.read());
        System.out.println("Document Number: ");
        rece.setDocNumber(Console.read());
        System.out.println("Telephone Number: ");
        rece.setTelephone(Console.read());
        System.out.println("Address: ");
        Address address = new Address();
        address.setStreet(Console.read());
        System.out.println("E-mail: ");
        rece.seteMail(Console.read());
        System.out.println("Permissions");
        System.out.println("1.- Administrator. 2.-Receptionist.");
        rece.setPermissions(Console.read());
        System.out.println("User: ");
        rece.setUserName(Console.read());
        System.out.println("Paswword: ");
        rece.setPassword(Console.read());
        rece.setStatus(true);

        hotel.setRecepcionist(rece);
        System.out.println("Succes creating new Recepcionist.");
        System.out.println("\n\n");
    }














}
