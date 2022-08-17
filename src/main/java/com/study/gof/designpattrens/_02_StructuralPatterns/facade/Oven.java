package com.study.gof.designpattrens._02_StructuralPatterns.facade;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Oven {

    public Pizza grillingPizza(Pizza pizza) {
        return pizza;
    }
}