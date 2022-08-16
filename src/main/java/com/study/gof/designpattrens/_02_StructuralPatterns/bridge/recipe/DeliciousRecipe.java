package com.study.gof.designpattrens._02_StructuralPatterns.bridge.recipe;

public class DeliciousRecipe implements Recipe{

    @Override
    public String getName() {
        return "맛있는";
    }
}