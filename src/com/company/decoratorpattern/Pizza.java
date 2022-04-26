package com.company.decoratorpattern;

public class Pizza {
    private String description;
    private double cost;

    public Pizza(String description, float cost) {
        this.description = description;
        this.cost = cost;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
