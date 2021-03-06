package com.hotelenterprise.person.user;

import com.hotelenterprise.functionality.*;
import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Reservation;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.client.Guest;
import com.hotelenterprise.services.Product;
import com.hotelenterprise.utilities.Console;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Administrator extends Employee implements Serializable, INewReservations {
    @Serial
    private static final long serialVersionUID = 1L;

    public Administrator() {

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
        System.out.println("Ingrese la fecha de check in (Formato aaaa-mm-dd)");
        String date = Console.read();

        reservation.setCheckIn(LocalDate.parse(date));
        System.out.println("Ingrese la fecha de check out (Formato aaaa-mm-dd)");
        date = Console.read();
        reservation.setCheckOut(LocalDate.parse(date));
        System.out.println("Cargando cliente");
        client = uploadClientInformation();

        client.setGuestList(uploadGuestInformation());

        loadingRooms(client, reservation);

        hotel.setReservationList(reservation);
        hotel.setClientList(client);
        System.out.println("Guardando reserva");
        hotel.writeReservation();

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
    public void loadingRooms(Client client, Reservation reservation) {
        List<Room> roomList = new ArrayList<>();
        List<Guest> guestToRemove = new ArrayList<>();
        guestToRemove = client.getGuestList();
        int choice = 0;
        System.out.println("Ingrese el total de habitaciones para cargar");
        int rooms = Console.readInteger();

        for (int i = 0; i < rooms; i++) {
            Room room = new Room();
            System.out.println("Habitaciones cargadas: " + i + " de " + rooms);
            System.out.println("Elija el tipo de habitacion");
            System.out.println("1: SINGLE \n 2: DOBLE: \n 3: TRIPLE: \n 4: CUADRUPLE: \n 0 terminar la carga");
            choice = Console.readInteger();
            loadingSingleRoom(choice, guestToRemove, room);
            roomList.add(room);
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
            showRoomNumbers();
            room.setRoomNumber(Console.readInteger());
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
    public void loadingGuestToRooms(List<Guest> guestList, int numOfGuest, Room room) {
        int choice = 0;
        for (int i = 0; i < numOfGuest; i++) {
            showGuest(guestList);
            System.out.println("Elija a uno de los pasajeros pasa asignar a la habitacion");
            choice = Console.readInteger();
            room.setGuestList(guestList.get(choice - 1));
            guestList.remove(choice - 1);
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
        Reservation aux = new Reservation();
        System.out.println("Ingrese el DNI del cliente due??o de la reserva!");
        String dni = Console.read();
        int position = searchReservation(hotel.getReservationList(), dni);
        if (position == -1) {
            System.out.println("No hay reserva asignada a ese DNI");
        } else {
            System.out.println("la Reserva fue encontrada: ");
            System.out.println(hotel.getReservationList().get(position).getClient().toString());
            System.out.println("\t Reserva cancelada.");
            hotel.setReservationCanceled(hotel.getReservationList().get(position));
            hotel.getReservationList().remove(position);

        }

    }

    @Override
    public int searchReservation(List<Reservation> reservations, String dni) {
        for (Reservation r : reservations) {
            if (r.getClient().getDocNumber().equals(dni)) {
                return reservations.indexOf(r);
            }
        }
        return -1;
    }

    /*
        public Reservation searchReservation(Hotel hotel) {

            int i = 0;
            List<Reservation> reservationsTemp = new ArrayList<>();
            for (Reservation r : hotel.getPastReservations()) {
                if (r.getCheckIn().equals(LocalDate.now())) {
                    System.out.println("reserva: " + i + "Check in: " + r.getCheckIn());
                    System.out.print("Cliente: " + r.getClient().getLastname());
                    reservationsTemp.add(r);
                    i++;
                }
                return r;
            }



    */
    @Override
    public Reservation searchReservation(Hotel hotel, String DNI) {

        for (Reservation reserv : hotel.getReservationList()) {
            if (reserv.getClient().getDocNumber().equals(DNI)) {
                return reserv;
            }
        }
        return null;
    }


    public void checkIn(Hotel hotel) {
        int choice = 0;
        int i = 0;
        Room roomi = new Room();
        String r;
        System.out.println("??Do you posses a reservation?");
        System.out.println("y / n");
        r = Console.read();
        if (r.equals("y")) {
            Reservation reserv;
            String dni;

            System.out.println("Input DNI number: ");
            dni = Console.read();
            reserv = searchReservation(hotel, dni);

            if (reserv != null) {
                roomi.setRoomNumber(reserv.getTypesOfRooms().get(1).getRoomNumber());
                System.out.println(" checkIn: ");
                roomi.setOccupied(true);
                roomi.setClient(reserv.getClient());
                for (Room room : reserv.getTypesOfRooms()) {
                    hotel.setOccupiedRooms(room);
                }

            }

        }


    }


    @Override
    public String toString() {
        return "Administrator{}" + super.toString();
    }

    public void createAdministrator(Hotel hotel) {

        Administrator admin = new Administrator();
        Employee emple = new Employee();

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

        hotel.setAdministratorList(admin);
        System.out.println("Succes creating new Administrator.");
        System.out.println("\n\n");
        // TODO cargar a la lista de admins
    }


    public void createRecepcionist(Hotel hotel) {

        Recepcionist rece = new Recepcionist();


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

        hotel.setRecepcionistList(rece);
        System.out.println("Succes creating new Recepcionist.");
        System.out.println("\n\n");
        //TODO cargar al archivos tambien
    }

    public int chargeConsumptions(Hotel hotel, Room room) {
        int i = 0, t = 0;
        String ctrl;
        int choice = 0;
        for (Product p : hotel.getProductList()) {
            System.out.println(" " + i + " " + p);
            i++;
        }
        do {
            System.out.println("Choose a product Number");
            choice = Console.readInteger();
            t++;
            System.out.println("Do you want another one?");
            System.out.println("y / n");
            ctrl = Console.read();

        } while (ctrl.equals("y"));

        room.setConsumptions(t);

        return t;
    }


    public Room searchRoomNumber(Hotel hotel, int number) {

        for (Room room : hotel.getRoomList()) {

            if (room.getRoomNumber() == number) {

                return room;
            }

        }
        return null;
    }


    public void checkOut(Hotel hotel) {
        Room room = new Room();
        Facture facture = new Facture();
        int choice = 0;
        System.out.println("Number of room to checkout");
        choice = Console.readInteger();
        if (choice > 0) {
            room = searchRoomNumber(hotel, choice);
            facture.facture(room);

            room.setOccupied(false);
            room.setClient(null);
            room.setConsumptions(0);


        } else {
            System.out.println("Error! debe ingresar un numero correcto.");
        }
    }


    public void listOfOccupiedRooms(Hotel hotel) {

        for (Room room : hotel.getRoomList()) {
            System.out.println("Room number: " + room.getRoomNumber());
            System.out.println("Client: " + room.getClient().getLastname());
        }
    }


}
