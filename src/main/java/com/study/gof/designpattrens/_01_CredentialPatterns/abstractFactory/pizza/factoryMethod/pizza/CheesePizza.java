package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.factoryMethod.pizza;

public class CheesePizza extends Pizza{

    public CheesePizza() {
        super();
        this.setName("Cheese pizza");
        this.setSauce("Cheese sauce");
        this.setTopping("Cheese");
    }

}