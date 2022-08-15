package com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod.pizza;

public class CheesePizza extends Pizza{

    public CheesePizza() {
        super();
        this.setName("Cheese pizza");
        this.setSauce("Cheese sauce");
        this.setTopping("Cheese");
    }

}