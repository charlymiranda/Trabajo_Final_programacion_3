package com.hotelenterprise.person.user;

import com.hotelenterprise.person.Person;
import com.hotelenterprise.person.client.Address;

import java.io.Serializable;

public abstract class Employee extends Person implements Serializable {
    private int idEmployee;
    private String permissions;
    private String userName;
    private String password;
    private boolean status;


    public Employee() {
    }

    public Employee(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail, int idEmployee, String permissions, String userName, String password, boolean status) {
        super(name, lastname, docType, docNumber, telephone, address, eMail);
        this.idEmployee = idEmployee;
        this.permissions = permissions;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    @Override
    public String toString() {
        return "Employee{" + super.toString() +
                "idEmployee=" + idEmployee +
                ", permissions='" + permissions + '\'' +
                ", userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", status=" + status +
                '}';
    }
}

