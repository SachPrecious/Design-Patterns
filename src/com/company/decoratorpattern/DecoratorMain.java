package com.company.decoratorpattern;

public class DecoratorMain {
    public static void main(String[] args) {

        //Create a classic Pizza
        Pizza classicPizza=new ThinCrustPizza();

        //add BBQ Toppings
        Pizza classicPizzaWithBBQ=new BBQPizzaDecorator(classicPizza);

       // Pizza classicPizzaWithBBQExtraCheese=new BBQPizzaDecorator();


        System.out.println(classicPizzaWithBBQ.getCost());
        //System.out.println(classicPizzaWithBBQ.getDescription());
        System.out.println("==========================================================================>");
        //System.out.println(classicPizzaWithBBQExtraCheese.getDescription());


    }

}


