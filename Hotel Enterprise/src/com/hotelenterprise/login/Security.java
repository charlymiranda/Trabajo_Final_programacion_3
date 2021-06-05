package com.hotelenterprise.login;


import javax.swing.*;

public class Security {
    Log login = new Log();
   // String answer;

    public Security() {
    }

    public void usersValidate(String users[], String user, String password, int tries) {
        String answer;
        boolean find = false;

        for (int i = 0; i < users.length; i++) {

            if (users[i].equalsIgnoreCase(user) && users[i + 1].equals(password)) {            //compara el ingreso sin importar si son mayusculas o minusculas

                answer = "Bienvenido a Enterprise " + user;
            find = true;
              //  JOptionPane.showMessageDialog(null, answer, "Inicio de Sesión", JOptionPane.INFORMATION_MESSAGE);


                System.out.println("Eres bienvenido esclavo del sector 7G "+ user);
                tries =0;
               login.setTries(tries);
                break;

            }
        }if (find==false){
            answer = "Usuario o clave incorrectos, quedan " + tries + " intentos";
           // JOptionPane.showMessageDialog(null, answer, "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);


        } if (tries>2) {
          //  JOptionPane.showMessageDialog(null, "Ha alcanzado 3 intentos fallidos. Por favor logueese nuevamente", "Inicio de Sesión", JOptionPane.ERROR_MESSAGE);
            System.exit(0);

        }

    }
}