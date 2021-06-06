package com.hotelenterprise.file;


import com.google.gson.*;
import com.hotelenterprise.person.client.Client;

import javax.naming.spi.ObjectFactoryBuilder;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public abstract class FileManagement {
/// esta clase va a serr inteface


    public static void writeJsonFile(List<Object> o, String file){

        Path path = Paths.get(file);

        try {
            Writer writer = Files.newBufferedWriter(path, StandardCharsets.UTF_8);
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            JsonElement tree = gson.toJsonTree(o);
            gson.toJson(tree, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<Object> readJsonFile(String file){
        Path path = Paths.get(file);
        List<Object> objects = new ArrayList<>();
        try {
            Reader reader = Files.newBufferedReader(path, StandardCharsets.UTF_8);
            JsonParser parser = new JsonParser();
            JsonElement tree = parser.parse(reader);
            JsonArray array = tree.getAsJsonArray();

            for (JsonElement element: array){
                objects.add(element);

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        return objects;
    }


}




