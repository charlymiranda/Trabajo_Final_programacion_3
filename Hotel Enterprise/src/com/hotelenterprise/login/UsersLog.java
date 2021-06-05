package com.hotelenterprise.login;

import com.hotelenterprise.menu.Colours;
import com.hotelenterprise.menu.Menu;

public class UsersLog {

    private String username;
    private String password;
    private String[][] accounts = {{"Charly", "man"},{"Danilo", "fibro"},{"Eze", "hola"},{"Bruno","fabri"}};
    Menu menu = new Menu();
    Colours color = new Colours();


    public UsersLog(String username, String password ) {
        this.username = username;
        this.password = password;
        //this.accounts = accounts;
        boolean active;
        this.menu = menu;
    }

    public boolean checkPassword()
    {

        if((username.equalsIgnoreCase(accounts[0][0])) && (password.equalsIgnoreCase(accounts[0][1]))) {

            System.out.println("\nWelcome allmighty " + "\033[34m" + username +color.b);


            menu.menuAdministrador();

            return true;



        }else if((username.equalsIgnoreCase(accounts[1][0])) && (password.equalsIgnoreCase(accounts[1][1]))){

            System.out.println("\nWelcome powerfull " + "\033[34m" + username +color.b);

            menu.menuAdministrador();

          return true;

        }else if((username.equalsIgnoreCase(accounts[2][0])) && (password.equalsIgnoreCase(accounts[2][1]))) {

            System.out.println("\nWelcome slave of the sector 7G " + "\033[32m" + username +color.b);
            menu.menuReceptionist();

            return true;
        }else if((username.equalsIgnoreCase(accounts[3][0])) && (password.equalsIgnoreCase(accounts[3][1]))) {

            System.out.println("\nWelcome insect of the sector 6W " + "\033[32m" + username +color.b);

            menu.menuReceptionist();

            return true;

        }else
            return false;
    }

    public void deactivateAccount()
    {
        boolean active = false;
    }



}
