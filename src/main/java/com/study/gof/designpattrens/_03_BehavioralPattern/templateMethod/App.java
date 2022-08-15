package com.study.gof.designpattrens._03_BehavioralPattern.templateMethod;

public class App {

    public static void main(String[] args) {
        //동일한 부분을 abstract claas로 만들고, 특정 메서드를 구현하는 구체클래스를 분리한다.
        Kimeunbin kimeunbin = new Kimeunbin();
        System.out.println("Kimeunbin");
        kimeunbin.Introducing();
        kimeunbin.eating();
        kimeunbin.sleeping();
        kimeunbin.coding();

        Kimgeumbin kimgeumbin = new Kimgeumbin();
        System.out.println("Kimgeumbin");
        kimgeumbin.Introducing();
        kimgeumbin.eating();
        kimgeumbin.sleeping();
        kimgeumbin.coding();
    }
}