package com.study.gof.designpattrens._01_CredentialPatterns.prototype;

public class App {
    public static void main(String[] args) {
        //정보가 똑같이 복사된다
        Pizza pizza1 = new Pizza("Cheese Pizza", "Cheese Topping", "Tomato sauce");

        Pizza pizza2 = pizza1.clone();

        System.out.println("Pizza1");
        System.out.println("name = " + pizza1.getName());
        System.out.println("Sauce = "+ pizza1.getSauce());
        System.out.println("Topping = "+ pizza1.getTopping());
        System.out.println();

        System.out.println("Pizza2");
        System.out.println("name = " + pizza2.getName());
        System.out.println("Sauce = "+ pizza2.getSauce());
        System.out.println("Topping = "+ pizza2.getTopping());
        System.out.println();
    }
}