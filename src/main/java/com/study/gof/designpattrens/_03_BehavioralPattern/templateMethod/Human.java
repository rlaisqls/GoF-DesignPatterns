package com.study.gof.designpattrens._03_BehavioralPattern.templateMethod;

public abstract class Human {

    abstract void Introducing();

    void eating() {
        System.out.println("밥먹기");
    }

    void sleeping() {
        System.out.println("잠자기");
    }

    void coding() {
        System.out.println("코딩하기");
    }

}