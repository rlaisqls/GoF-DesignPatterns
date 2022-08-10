package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Topping.Topping;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.PineapplePizza;

public class PineapplePizzaFactory implements PizzaFactory {

    @Override
    public Pizza createPizza() {

        PineapplePizzaIngredientFactory pizzaIngredientFactory = new PineapplePizzaIngredientFactory();

        String name = "Pineapple Pizza";
        Sauce sauce = pizzaIngredientFactory.createSauce();
        Topping topping = pizzaIngredientFactory.createTopping();

        return new PineapplePizza(name, sauce, topping);
    }
}