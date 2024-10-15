package com.festivalbiere.model;

public class Beer {
    private int id;
    private String name;
    private String origin;
    private String type;
    private double adb;
    private String flavor;
    private String img;

    public Beer() {}

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
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getOrigin() { return origin; }
    public void setOrigin(String origin) { this.origin = origin; }

    public String getType() { return type; }
    public void setType(String type) { this.type = type; }

    public double getAdb() { return adb; }
    public void setAdb(double adb) { this.adb = adb; }

    public String getFlavor() { return flavor; }
    public void setFlavor(String flavor) { this.flavor = flavor; }

    public String getImg() { return img; }
    public void setImg(String img) { this.img = img; }
}