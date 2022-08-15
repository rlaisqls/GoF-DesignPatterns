package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Sauce.PineappleSauce;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Topping.PineappleTopping;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Topping.Topping;

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