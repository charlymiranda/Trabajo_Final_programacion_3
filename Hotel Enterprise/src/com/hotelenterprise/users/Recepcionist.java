package com.hotelenterprise.users;

import com.hotelenterprise.hotel.Reservation;

import java.util.ArrayList;
import java.util.List;

public class Recepcionist extends Employee{

    private String Schedule;
    private List<Reservation> salesRecord = new ArrayList<>();

    public Recepcionist(){

    }

    public Recepcionist(String name, String lastname, String docType, String docNumber, String telephone, String address, String eMail,
                        int idEmployee, String permissions, String userName, String password, boolean status, String schedule,
                        List<Reservation> salesRecord) {
        super(name, lastname, docType, docNumber, telephone, address, eMail, idEmployee, permissions, userName, password, status);
        Schedule = schedule;
        this.salesRecord = salesRecord;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String schedule) {
        Schedule = schedule;
    }

    public List<Reservation> getSalesRecord() {
        return salesRecord;
    }

    public void setSalesRecord(List<Reservation> salesRecord) {
        this.salesRecord = salesRecord;
    }



    @Override
    public String toString() {
        return "Recepcionist{" +
                "Schedule='" + Schedule + '\'' +
                ", salesRecord=" + salesRecord +
                '}';
    }
}
