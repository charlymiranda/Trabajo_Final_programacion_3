package com.hotelenterprise.person.user;

import com.hotelenterprise.person.client.Address;

import java.io.Serializable;

public class Administrator extends Employee implements Serializable {

    public Administrator(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail, int idEmployee,
                         String permissions, String userName, String password, boolean status) {
        super(name, lastname, docType, docNumber, telephone, address, eMail, idEmployee, permissions, userName, password, status);
    }

    @Override
    public String toString() {
        return "Administrator{}" + super.toString();
    }
}
