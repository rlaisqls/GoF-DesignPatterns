package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.PineappleSauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.PineappleTopping;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;

public class PineapplePizzaIngredientFactory implements PizzaIngredientFactory {

    @Override
    public Sauce createSauce() {
        return new PineappleSauce();
    }

    @Override
    public Topping createTopping() {
        return new PineappleTopping();
    }
}