package com.study.gof.designpattrens._01_CredentialPatterns.factoryMethod;

import com.study.gof.designpattrens._01_CredentialPatterns.factoryMethod.pizza.CheesePizza;
import com.study.gof.designpattrens._01_CredentialPatterns.factoryMethod.pizza.PineapplePizza;
import com.study.gof.designpattrens._01_CredentialPatterns.factoryMethod.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.factoryMethod.pizza.PizzaType;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PizzaFactory {

    public Pizza createPizza(PizzaType pizzaType){
        switch (pizzaType) {
            case CHEESE:
                return new CheesePizza();
            case PINEAPPLE:
                return new PineapplePizza();
        }
        return null;
    }

}