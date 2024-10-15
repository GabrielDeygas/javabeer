package com.festivalbiere.model;

public class Review {
    private int id;
    private int userId;
    private int beerId;
    private int note;
    private String details;

    public Review(int id, int userId, int beerId, int note, String details) {
        this.id = id;
        this.userId = userId;
        this.beerId = beerId;
        this.note = note;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getBeerId() {
        return beerId;
    }

    public void setBeerId(int beerId) {
        this.beerId = beerId;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
}
