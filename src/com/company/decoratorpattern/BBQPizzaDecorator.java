package com.company.decoratorpattern;

public class BBQPizzaDecorator extends PizzaDecorator{


    public BBQPizzaDecorator(Pizza p) {
        super(p);
    }

    @Override
    public double getCost() {
        double previousCost=super.getCost();
        return previousCost+300;
    }


}
