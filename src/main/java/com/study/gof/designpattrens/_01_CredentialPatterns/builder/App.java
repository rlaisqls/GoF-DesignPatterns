package com.study.gof.designpattrens._01_CredentialPatterns.builder;

public class App {

    public static void main(String[] args) {

        //변수를 넣는 순서가 바뀌거나, 추가, 제거되도 유연하게 대처할 수 있다.
        Pizza pizza = Pizza.builder()
                .sauce("Cheese sauce")
                .name("Cheese pizza")
                .topping("A lot of cheese")
                .build();

        System.out.println(pizza.toString());

    }

}