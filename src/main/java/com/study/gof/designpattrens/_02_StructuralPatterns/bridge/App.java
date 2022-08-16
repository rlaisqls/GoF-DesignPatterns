package com.study.gof.designpattrens._02_StructuralPatterns.bridge;

import com.study.gof.designpattrens._02_StructuralPatterns.bridge.pizza.CheesePizza;
import com.study.gof.designpattrens._02_StructuralPatterns.bridge.pizza.PineapplePizza;
import com.study.gof.designpattrens._02_StructuralPatterns.bridge.pizza.Pizza;
import com.study.gof.designpattrens._02_StructuralPatterns.bridge.recipe.DeliciousRecipe;
import com.study.gof.designpattrens._02_StructuralPatterns.bridge.recipe.NormalRecipe;

public class App {

    public static void main(String[] args) {
        //다양한 Recipe(행위)를 독립적으로 변경, 추가, 수정할 수 있다.
        NormalRecipe normalRecipe = new NormalRecipe();
        DeliciousRecipe deliciousRecipe = new DeliciousRecipe();

        Pizza pizza1 = new CheesePizza(normalRecipe);
        Pizza pizza2 = new PineapplePizza(deliciousRecipe);

        System.out.println("pizza1.result() = " + pizza1.result());
        System.out.println("pizza2.result() = " + pizza2.result());
    }
}