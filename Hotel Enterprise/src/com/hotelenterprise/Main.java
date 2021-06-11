package com.hotelenterprise;


import com.hotelenterprise.hotel.Hotel;
import com.hotelenterprise.menu.Menu;


public class Main {

    public static void main(String[] args) {


        //Gson file = new GsonBuilder().create();
        Hotel hotel = new Hotel();
        hotel.readFromJsonFile();

       /* Address ad = new Address("Mar del plata", "Dolores","462","no", "no");
        Administrator admin = new Administrator("Charly2","Miranda","dni", "3245253","223571156",ad,"charly.com","2","charly2","man",true);
        hotel.setAdministratorList(admin);
        Recepcionist rece = new Recepcionist("Eze","Miranda","dni","3245253","223571156",ad,"charly.com","2","eze","hola",true);
        hotel.setRecepcionistList(rece);
        hotel.writeAdministrator();
*/
        System.out.println(hotel.getRoomList());

        Menu menu = new Menu();
        menu.menu(hotel);


    }

}





