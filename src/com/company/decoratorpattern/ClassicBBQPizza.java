package com.company.decoratorpattern;

public class ClassicBBQPizza extends ClassicPizza{
    @Override
    public String getDescription() {
        return "Classic BBQ Pizza";
    }

    @Override
    public double getCost() {
        return 1300.0;
    }
}
