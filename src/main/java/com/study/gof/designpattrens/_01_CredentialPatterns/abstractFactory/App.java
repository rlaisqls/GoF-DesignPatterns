package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.factory.CheesePizzaFactory;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.factory.PineapplePizzaFactory;
import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Pizza;

public class App {

    public static void main(String[] args) {
        //main 메서드가 Pizza의 자식인 Sauce와 Topping에 대한 정보를 몰라도 Pizza를 생성할 수 있다.
        CheesePizzaFactory cheesePizzaFactory = new CheesePizzaFactory();
        PineapplePizzaFactory pineapplePizzaFactory = new PineapplePizzaFactory();

        Pizza cheesePizza = cheesePizzaFactory.createPizza();
        Pizza pineapplePizza = pineapplePizzaFactory.createPizza();

        System.out.println("CheesePizza");
        System.out.println("name = " + cheesePizza.getName());
        System.out.println("Sauce = "+ cheesePizza.getSauce().getClass());
        System.out.println("Topping = "+ cheesePizza.getTopping().getClass());
        System.out.println();

        System.out.println("PineapplePizza");
        System.out.println("name = " + pineapplePizza.getName());
        System.out.println("Sauce = "+ pineapplePizza.getSauce().getClass());
        System.out.println("Topping = "+ pineapplePizza.getTopping().getClass());
        System.out.println();
    }

}