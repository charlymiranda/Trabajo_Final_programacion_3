package com.hotelenterprise.file;

import com.google.gson.Gson;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.person.client.Client;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FileManagement {
/// esta clase va a serr inteface.
    public static void appendFile(String fileName, List<Room> r) {

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName))) {
            oos.writeObject(r);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    public static void appendFile(String fileName, Room r){
        try (MyObjectOutputStream moos = new MyObjectOutputStream(new FileOutputStream(fileName))) {
            moos.writeObject(r);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void readFile(String fileName) {
        //Room room = new Room();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName))) {
            List<Room> roomList = (List<Room>) ois.readObject();
            for(Room room: roomList){
                System.out.println("habitacion " + room.getRoomNumber());
                System.out.println("Descripcion: " + room.getDescription());
                System.out.println("Ocupada: " + room.isOccupied());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace(System.out);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void writeGson(File file){

        Room room = new Room();
        List<Client> clients = new ArrayList<>();

        

    }


    public static void readGson(File file){
        Gson gson = new Gson();
        try {
            Reader reader = Files.newBufferedReader(Paths.get("\\DataFiles\\Rooms.json"));
            Room room = gson.fromJson(reader, Room.class);
            System.out.println(room);
            reader.close();
        }catch (IOException e) {
            e.printStackTrace(System.out);
        }


    }

}




