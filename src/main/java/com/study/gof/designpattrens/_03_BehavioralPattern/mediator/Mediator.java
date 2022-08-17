package com.study.gof.designpattrens._03_BehavioralPattern.mediator;

public interface Mediator {
    void addColleague(Colleague colleague);
    void mediate(Colleague colleague);
}