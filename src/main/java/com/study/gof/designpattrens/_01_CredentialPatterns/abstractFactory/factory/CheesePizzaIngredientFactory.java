package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.CheeseSauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.CheeseTopping;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;

public class CheesePizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new CheeseSauce();
    }

    @Override
    public Topping createTopping() {
        return new CheeseTopping();
    }
}