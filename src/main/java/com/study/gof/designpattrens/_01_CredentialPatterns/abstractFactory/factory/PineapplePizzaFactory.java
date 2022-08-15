package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.PineapplePizza;

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