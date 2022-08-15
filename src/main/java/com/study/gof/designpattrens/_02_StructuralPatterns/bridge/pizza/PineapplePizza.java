package com.study.gof.designpattrens._02_StructuralPatterns.Bridge.pizza;

import com.study.gof.designpattrens._02_StructuralPatterns.Bridge.recipe.Recipe;

public class  PineapplePizza  extends Pizza {
    public  PineapplePizza (Recipe recipe){
        super("파인애플 피자", recipe);
    }
}