package com.study.gof.designpattrens._02_StructuralPatterns.Flyweight;

import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Dough;
import com.study.gof.designpattrens._02_StructuralPatterns.Flyweight.ingredient.Sauce;

public class App {

    public static void main(String[] args) {
        //특정 Key값을 가지는 피자에 대한 메모리공간을 재사용한다.
        Pizza pizza1 = PizzaIngredientFactory.getIngredient(Dough.NORMAL, Sauce.TOMATO);
        pizza1.setName("일반 피자");
        pizza1.setPrice(10000);
        System.out.println("pizza1 = " + pizza1);

        Pizza pizza2 = PizzaIngredientFactory.getIngredient(Dough.NORMAL, Sauce.TOMATO);
        pizza2.setName("특별한 피자");
        pizza2.setPrice(15000);
        System.out.println("pizza2 = " + pizza2);

        System.out.println(pizza1.getName() + " " + pizza2.getName());

        for (int i = 0; i < 10; i++) {
            Pizza pizza3 = PizzaIngredientFactory.getIngredient(Dough.THIN, Sauce.CHEESE);
            pizza3.setName("더 특별한 피자");
            pizza3.setPrice(20000);
            System.out.println("pizza3 = " + pizza3);
        }
    }
}