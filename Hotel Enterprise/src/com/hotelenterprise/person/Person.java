package com.hotelenterprise.person;

import com.hotelenterprise.person.client.Address;
import com.sun.jdi.request.ClassUnloadRequest;

import java.io.Serializable;

public abstract class Person implements Serializable {
    private String name;
    private String lastname;
    private String docType;
    private String docNumber;
    private String telephone;
    private Address address;
    private String eMail;

    public Person() {
    }

    public Person(String name, String lastname, String docType, String docNumber, String telephone, Address address, String eMail) {
        this.name = name;
        this.lastname = lastname;
        this.docType = docType;
        this.docNumber = docNumber;
        this.telephone = telephone;
        this.address = address;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDocType() {
        return docType;
    }

    public void setDocType(String docType) {
        this.docType = docType;
    }

    public String getDocNumber() {
        return docNumber;
    }

    public void setDocNumber(String docNumber) {
        this.docNumber = docNumber;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", docType='" + docType + '\'' +
                ", docNumber='" + docNumber + '\'' +
                ", telephone='" + telephone + '\'' +
                ", address='" + address + '\'' +
                ", eMail='" + eMail + '\'' +
                '}';
    }
}
