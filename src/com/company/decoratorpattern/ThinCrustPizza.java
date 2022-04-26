package com.company.decoratorpattern;

public class ThinCrustPizza extends Pizza{
    public ThinCrustPizza(String description, float cost) {
        super(description, cost);
    }

    @Override
    public String getDescription() {
        return "Thin crust pizza";
    }

    @Override
    public double getCost() {
        return 1500.0;
    }
}
