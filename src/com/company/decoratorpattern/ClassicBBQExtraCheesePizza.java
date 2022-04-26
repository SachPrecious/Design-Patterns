package com.company.decoratorpattern;

public class ClassicBBQExtraCheesePizza extends ClassicBBQPizza{
    @Override
    public String getDescription() {
        return "Classic,BBQ Pizza with Extra Cheese ";
    }

    @Override
    public double getCost() {
        return 1400.0;
    }
}
