package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;

public class CheesePizza extends Pizza {
    public CheesePizza(String name, Sauce sauce, Topping topping) {
        super(name, sauce, topping);
    }
}