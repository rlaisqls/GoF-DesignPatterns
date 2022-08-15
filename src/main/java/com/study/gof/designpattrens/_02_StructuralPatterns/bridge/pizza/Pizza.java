package com.study.gof.designpattrens._02_StructuralPatterns.Bridge.pizza;

import com.study.gof.designpattrens._02_StructuralPatterns.Bridge.recipe.Recipe;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public abstract class Pizza {

    private String name;
    private Recipe recipe;

    public String result(){
        return recipe.getName() + " " + name;
    }
}