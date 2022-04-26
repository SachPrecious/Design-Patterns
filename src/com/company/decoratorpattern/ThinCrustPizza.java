package com.company.decoratorpattern;

public class ThinCrustPizza extends Pizza{



    @Override
    public String getDescription() {
        return "Thin crust pizza";
    }

    @Override
    public double getCost() {
        return 1500.0;
    }
}
