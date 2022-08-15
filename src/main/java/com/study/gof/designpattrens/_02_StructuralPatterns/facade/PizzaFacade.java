package com.study.gof.designpattrens._02_StructuralPatterns.Facade;

public class PizzaFacade {

    private final Chef chef = new Chef();
    private final Oven oven = new Oven();

    public Pizza makingPizza() {

        Pizza pizza = chef.makingDough();

        pizza = chef.addToppings(pizza);

        return oven.grillingPizza(pizza);

    }
}