package com.study.gof.designpattrens._02_StructuralPatterns.flyweight;

import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Dough;
import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Ingredient;
import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Sauce;
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