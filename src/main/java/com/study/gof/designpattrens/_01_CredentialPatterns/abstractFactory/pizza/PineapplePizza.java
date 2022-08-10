package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Topping.Topping;

public class PineapplePizza extends Pizza {
    public PineapplePizza(String name, Sauce sauce, Topping topping) {
        super(name, sauce, topping);
    }
}