package com.festivalbiere.servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/beers")
public class BeerServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    class Beer {
        int id;
        String name;
        String origin;
        String type;
        double adb;
        String flavor;
        String img;

        public Beer(int id, String name, String origin, String type, double adb, String flavor, String img) {
            this.id = id;
            this.name = name;
            this.origin = origin;
            this.type = type;
            this.adb = adb;
            this.flavor = flavor;
            this.img = img;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public String getOrigin() { return origin; }
        public String getType() { return type; }
        public double getAdb() { return adb; }
        public String getFlavor() { return flavor; }
        public String getImg() { return img; }
    }

    private List<Beer> getBeers() {
        List<Beer> beers = new ArrayList<>();
        beers.add(new Beer(1, "La Chouffe", "Belgium", "Blonde", 8.0, "Fruité, Épicé", "chouffe.jpg"));
        beers.add(new Beer(2, "Leffe Blonde", "Belgium", "Bière d'Abbaye", 6.6, "Doux, Malté", "leffe.jpg"));
        beers.add(new Beer(3, "Guinness", "Ireland", "Stout", 4.2, "Amer, Torréfié", "guinness.jpg"));
        beers.add(new Beer(4, "Kwak", "Belgium", "Ambrée", 8.4, "Caramel, Malté", "kwak.jpg"));
        beers.add(new Beer(5, "Heineken", "Netherlands", "Lager", 5.0, "Léger, Croquant", "heineken.jpg"));
        return beers;
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Beer> beers = getBeers();

        request.setAttribute("beers", beers);

        request.getRequestDispatcher("/WEB-INF/views/beers.jsp").forward(request, response);
    }
}
