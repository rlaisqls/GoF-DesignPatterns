package com.study.gof.designpattrens._02_StructuralPatterns.Bridge.recipe;

public class NormalRecipe implements Recipe{

    @Override
    public String getName() {
        return "그냥";
    }
}