package com.study.gof.designpattrens._02_StructuralPatterns.bridge.pizza;

import com.study.gof.designpattrens._02_StructuralPatterns.bridge.recipe.Recipe;

public class CheesePizza extends Pizza {
    public CheesePizza(Recipe recipe){
        super("치즈 피자", recipe);
    }
}