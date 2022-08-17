package com.study.gof.designpattrens._02_StructuralPatterns.facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Chef {

    public Pizza makingDough() {
        return new Pizza();
    }

    public Pizza addToppings(Pizza pizza) {
        return pizza;
    }
}