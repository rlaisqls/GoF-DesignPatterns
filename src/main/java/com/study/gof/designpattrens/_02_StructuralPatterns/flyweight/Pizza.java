package com.study.gof.designpattrens._02_StructuralPatterns.flyweight;

import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Dough;
import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Ingredient;
import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Sauce;
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