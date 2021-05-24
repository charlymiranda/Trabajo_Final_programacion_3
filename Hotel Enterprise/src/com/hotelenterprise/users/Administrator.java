package com.hotelenterprise.users;

public class Administrator extends Employee{

    public Administrator(String name, String lastname, String docType, String docNumber, String telephone, String address, String eMail, int idEmployee,
                         String permissions, String userName, String password, boolean status) {
        super(name, lastname, docType, docNumber, telephone, address, eMail, idEmployee, permissions, userName, password, status);
    }

    @Override
    public String toString() {
        return "Administrator{}" + super.toString();
    }
}
