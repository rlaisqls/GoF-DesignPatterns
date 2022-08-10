package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.CheesePizza;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Topping.Topping;

public class CheesePizzaFactory implements PizzaFactory{

    @Override
    public Pizza createPizza() {

        CheesePizzaIngredientFactory pizzaIngredientFactory = new CheesePizzaIngredientFactory();

        String name = "Cheese Pizza";
        Sauce sauce = pizzaIngredientFactory.createSauce();
        Topping topping = pizzaIngredientFactory.createTopping();

        return new CheesePizza(name, sauce, topping);
    }
}