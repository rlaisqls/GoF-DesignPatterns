package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.factoryMethod;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.factoryMethod.pizza.Pizza;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.factoryMethod.pizza.PizzaType;

public class App {

    public static void main(String[] args) {

        PizzaFactory pizzaFactory = new PizzaFactory();

        Pizza pizza1 = pizzaFactory.createPizza(PizzaType.CHEESE);
        Pizza pizza2 = pizzaFactory.createPizza(PizzaType.PINEAPPLE);

        //같은 메서드에서 생성됐지만 클래스가 다르다
        System.out.println("pizza1.getClass() = " + pizza1.getClass());
        System.out.println("pizza2.getClass() = " + pizza2.getClass());
    }
}