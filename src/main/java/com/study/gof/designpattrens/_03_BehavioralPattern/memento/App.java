package com.study.gof.designpattrens._03_BehavioralPattern.memento;

public class App {

    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("state1");
        originator.setState("state2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("state4");
        careTaker.add(originator.saveStateToMemento());

        System.out.println("현재 상태 : " + originator.getState());
        System.out.println("첫 번째 저장 : " + careTaker.get(0).getState());
        System.out.println("두 번째 저장 : " + careTaker.get(1).getState());

        originator.getStateFromMemento(careTaker.get(0)); //두번째 저장으로 Rollback
        System.out.println("롤백 후 상태 : " + originator.getState());
    }
}