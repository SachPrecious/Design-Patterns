package com.company.decoratorpattern;

public class ClassicPizza extends Pizza{
    public ClassicPizza(String description, float cost) {
        super(description, cost);
    }

    @Override
    public String getDescription() {
        return super.getDescription();
    }

    @Override
    public double getCost() {
        return super.getCost();
    }
}
