package com.festivalbiere.model;

import java.util.List;

public class Recipe {
    private int id;
    private int userId;
    private List<String> ingredients;
    private List<String> steps;

    public Recipe(int id, int userId, List<String> ingredients, List<String> steps) {
        this.id = id;
        this.userId = userId;
        this.ingredients = ingredients;
        this.steps = steps;
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

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public List<String> getSteps() {
        return steps;
    }

    public void setSteps(List<String> steps) {
        this.steps = steps;
    }
}
