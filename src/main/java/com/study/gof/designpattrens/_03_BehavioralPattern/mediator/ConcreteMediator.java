package com.study.gof.designpattrens._03_BehavioralPattern.mediator;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private final List<Colleague> colleagues = new ArrayList<>();

    @Override
    public void addColleague(Colleague colleague) {
        this.colleagues.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void mediate(Colleague colleague) {
        for (Colleague receiverColleague : colleagues) {
            System.out.println("    Mediating " + colleague.getName() + " to " + receiverColleague.getName());
            receiverColleague.receive(colleague);
        }
    }
}