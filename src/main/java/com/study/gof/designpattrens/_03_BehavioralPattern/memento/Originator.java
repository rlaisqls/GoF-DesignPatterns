package com.study.gof.designpattrens._03_BehavioralPattern.memento;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Originator {
    private String state;

    public Memento saveStateToMemento() {
        return new Memento(state);
    }

    public void getStateFromMemento(Memento memento) {
        state = memento.getState();
    }
}