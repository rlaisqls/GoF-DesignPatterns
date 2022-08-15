package com.study.gof.designpattrens._03_BehavioralPattern.interpreter;

public class App {

    public static void main(String[] args) {
        //규칙적이지만 연산 과정이 복잡한 로직을 언어로 구현한다.
        PlusExpression plusExpression = new PlusExpression();
        MinusExpression minusExpression = new MinusExpression();

        System.out.println("1 + 2 = " + plusExpression.interpret("1+2"));
        System.out.println("3 - 2 = " + minusExpression.interpret("3-2"));
    }
}