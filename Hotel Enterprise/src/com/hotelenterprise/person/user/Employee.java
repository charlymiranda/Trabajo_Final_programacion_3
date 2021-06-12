package com.hotelenterprise.person.user;


import com.google.gson.annotations.SerializedName;
import com.hotelenterprise.person.Person;
import com.hotelenterprise.person.client.Address;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

public class Employee extends Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @SerializedName("fIdEmployee")
    private UUID idEmployee = UUID.randomUUID();
    @SerializedName("fPermissions")
    private String permissions;
    @SerializedName("fUsername")
    private String userName;
    @SerializedName("fPassword")
    private String password;
    @SerializedName("fStatus")
    private boolean status;


    public Employee() {
    }

    public Employee(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail, String permissions, String userName, String password, boolean status) {
        super(name, lastname, docType, docNumber, telephone, address, eMail);
        this.permissions = permissions;
        this.userName = userName;
        this.password = password;
        this.status = status;
    }

    public UUID getIdEmployee() {
        return idEmployee;
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


