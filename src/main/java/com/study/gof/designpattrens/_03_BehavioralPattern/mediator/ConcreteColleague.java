package com.study.gof.designpattrens._03_BehavioralPattern.mediator;

public class ConcreteColleague extends Colleague{

    public ConcreteColleague(String name) {
        super(name);
    }

    @Override
    public void receive(Colleague colleague) {
        System.out.println(this.name + " received " + colleague.getName() + "'s Message : " + colleague.getMessage());
    }
}