package com.study.gof.designpattrens._01_CredentialPatterns.FactoryMethod.pizza;


public class PineapplePizza extends Pizza {

    public PineapplePizza() {
            super();
            this.setName("Pineapple pizza");
            this.setSauce("Pineapple sauce");
            this.setTopping("Pineapple");
    }

}