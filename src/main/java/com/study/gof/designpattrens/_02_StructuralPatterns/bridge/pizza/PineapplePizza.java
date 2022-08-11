package com.study.gof.designpattrens._02_StructuralPatterns.bridge.pizza;

import com.study.gof.designpattrens._02_StructuralPatterns.bridge.recipe.Recipe;

public class  PineapplePizza  extends Pizza {
    public  PineapplePizza (Recipe recipe){
        super("파인애플 피자", recipe);
    }
}