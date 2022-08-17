package com.study.gof.designpattrens._03_BehavioralPattern.visitor;

public class App {

    public static void main(String[] args) {

        Visitor visitor = new Visitor();

        ElementA elementA = new ElementA();
        elementA.visit(visitor);

        ElementB elementB = new ElementB();
        elementB.visit(visitor);
    }
}