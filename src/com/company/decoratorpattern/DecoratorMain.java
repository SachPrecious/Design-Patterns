package com.company.decoratorpattern;

public class DecoratorMain {
    public static void main(String[] args) {
        Pizza pizza1=new ClassicPizza();
        Pizza pizza2=new ThinCrustPizza();


        System.out.println(pizza1.getCost());
        System.out.println(pizza1.getDescription());


    }

}


