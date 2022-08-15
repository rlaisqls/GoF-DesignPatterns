package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.CheesePizza;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;

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