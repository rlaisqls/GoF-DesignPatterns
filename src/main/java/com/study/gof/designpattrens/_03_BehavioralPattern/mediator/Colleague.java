package com.study.gof.designpattrens._03_BehavioralPattern.mediator;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Colleague {

    protected String name;
    private Mediator mediator;
    private String message;

    public Colleague(String name) {
        this.name = name;
    }

    public void send() {
        System.out.println(this.name + " send()");
        mediator.mediate(this);
    }

    public abstract void receive(Colleague colleague);

}