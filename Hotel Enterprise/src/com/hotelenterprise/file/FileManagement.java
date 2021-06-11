package com.hotelenterprise.file;


import com.google.gson.*;
import com.hotelenterprise.hotel.Room;
import com.hotelenterprise.person.client.Client;

import javax.naming.spi.ObjectFactoryBuilder;
import java.io.*;
import java.lang.reflect.Type;
import java.nio.Buffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public abstract class FileManagement {
/// esta clase va a serr inteface
//private static final Type ROOM_TYPE = new Type


    public static void writeJsonFile(List<Object> o, String file){

        try {
            Gson gson = new Gson();
            Writer writer = Files.newBufferedWriter(Paths.get(file));
            gson.toJson(o, writer);

            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> readJsonFile(String file){
        Path path = Paths.get(file);
        List<Object> objects = new ArrayList<>();
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(file));
            gson.fromJson(reader, Object.class);
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return objects;
    }

    public static HashMap<String, String> readWhitHashMap(String file){
        String path = file;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            Gson gson = new Gson();
            HashMap<String, String> json = gson.fromJson(bufferedReader, HashMap.class);
            return json;
        }catch (IOException ioException){
            ioException.printStackTrace();
        }
        return null;

    }


}




