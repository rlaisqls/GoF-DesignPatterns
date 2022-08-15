package com.study.gof.designpattrens._02_StructuralPatterns.Flyweight;

import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Dough;
import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Ingredient;
import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Sauce;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza {

    public Pizza(Ingredient ingredient){
        this.dough = ingredient.getDough();
        this.sauce = ingredient.getSauce();
    }

    private String name;
    private int price;
    private Dough dough;
    private Sauce sauce;
}