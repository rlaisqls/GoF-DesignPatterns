package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;

public interface PizzaIngredientFactory {
    public Sauce createSauce();
    public Topping createTopping();
}