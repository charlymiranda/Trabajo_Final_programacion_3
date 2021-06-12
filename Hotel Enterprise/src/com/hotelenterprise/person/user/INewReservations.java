package com.hotelenterprise.person.user;

import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.hotel.Reservation;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.person.client.Address;
import com.hotelenterprise.person.client.Client;
import com.hotelenterprise.person.client.Guest;

import java.util.List;

public interface INewReservations {

    void newBook(Hotel hotel);

    Client uploadClientInformation();

    Address setAddressInformation();

    List<Guest> uploadGuestInformation();

    void loadingRooms(Client client, Reservation reservation);

    void loadingSingleRoom(int choice, List<Guest> guestToRemove, Room room);

    String chooseTypeOfDocument();

    void showRoomNumbers();

    void loadingGuestToRooms(List<Guest> guestList, int numOfGuest, Room room);

    void showGuest(List<Guest> guestList);

    void cancelReservations(Hotel hotel);

    Reservation searchReservation(Hotel hotel, String DNI);

    int searchReservation(List<Reservation> reservations, String dni);
}
