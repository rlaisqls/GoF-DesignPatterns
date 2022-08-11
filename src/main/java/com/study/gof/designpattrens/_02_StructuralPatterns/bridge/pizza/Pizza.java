package com.study.gof.designpattrens._02_StructuralPatterns.bridge.pizza;

import com.study.gof.designpattrens._02_StructuralPatterns.bridge.recipe.Recipe;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Pizza {

    private String name;
    private Recipe recipe;

    public String result(){
        return recipe.getName() + " " + name;
    }
}