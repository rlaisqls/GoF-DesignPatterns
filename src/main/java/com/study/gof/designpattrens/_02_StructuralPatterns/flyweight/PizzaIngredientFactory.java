package com.study.gof.designpattrens._02_StructuralPatterns.Flyweight;

import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Dough;
import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Ingredient;
import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Sauce;
import lombok.NoArgsConstructor;

import java.util.HashMap;

@NoArgsConstructor
public class PizzaIngredientFactory {
    private static final HashMap<Ingredient, Pizza> flyweightData = new HashMap<>();

    public static Pizza getIngredient(Dough dough, Sauce sauce) {

        Ingredient ingredient = new Ingredient(dough, sauce);

        Pizza pizza = flyweightData.get(ingredient);

        if (pizza == null) {
            pizza = new Pizza(ingredient);
            flyweightData.put(ingredient, pizza);
        }
        return pizza;
    }
}