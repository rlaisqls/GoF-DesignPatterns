package com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod;

import com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod.pizza.CheesePizza;
import com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod.pizza.PineapplePizza;
import com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod.pizza.PizzaType;
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