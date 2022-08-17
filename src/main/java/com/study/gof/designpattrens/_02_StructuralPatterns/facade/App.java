package com.study.gof.designpattrens._02_StructuralPatterns.facade;

public class App {

    public static void main(String[] args) {
        //하위 클래스에 대한 의존성 없이 로직을 실행시킨 결과만 취한다.
        PizzaFacade pizzaFacade = new PizzaFacade();

        Pizza pizza = pizzaFacade.makingPizza();

        System.out.println(pizza);
    }
}