package com.company.decoratorpattern;

public class ClassicPizza extends Pizza{

    @Override
    public String getDescription() {
        return "Classic Pizza";
    }

    @Override
    public double getCost() {
        return 1000.0;
    }
}
