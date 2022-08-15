package com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.factory;

import com.study.gof.designpattrens._01_CredentialPatterns.abstractFactory.pizza.Pizza;

public interface PizzaFactory {

    public Pizza createPizza();
}