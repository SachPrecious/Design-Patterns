package com.company.decoratorpattern;

public abstract class PizzaDecorator extends Pizza{

    private Pizza pizza;
    public PizzaDecorator(Pizza p) {
        this.pizza=p;
    }


}
