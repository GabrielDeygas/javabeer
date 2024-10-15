package com.festivalbiere.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.festivalbiere.model.Beer;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BeerService {

    private List<Beer> beers;
    private final String FILE_PATH = "C:/path/to/your/json/beers.json";

    public BeerService() {
        beers = new ArrayList<>();
        loadBeersFromJson();
    }

    public List<Beer> getAllBeers() {
        return beers;
    }

    public void addBeer(Beer beer) {
        beers.add(beer);
        saveBeersToJson();
    }

    public void removeBeer(String name) {
        beers.removeIf(b -> b.getName().equalsIgnoreCase(name));
        saveBeersToJson();
    }

    private void loadBeersFromJson() {
        ObjectMapper mapper = new ObjectMapper();
        File file = new File(FILE_PATH);
        if (file.exists()) {
            try {
                beers = mapper.readValue(file, new TypeReference<List<Beer>>() {});
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void saveBeersToJson() {
        ObjectMapper mapper = new ObjectMapper();
        try {
            mapper.writeValue(new File(FILE_PATH), beers);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
