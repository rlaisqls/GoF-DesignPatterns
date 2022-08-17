package com.study.gof.designpattrens._03_BehavioralPattern.mediator;

public class App {
    public static void main(String args[]) {
        Mediator mediator = new ConcreteMediator();
        Colleague colleague1 = new ConcreteColleague("User1");
        Colleague colleague2 = new ConcreteColleague("User2");

        mediator.addColleague(colleague1);
        mediator.addColleague(colleague2);

        colleague1.setMessage("Hello, world!");
        colleague1.send();
    }
}