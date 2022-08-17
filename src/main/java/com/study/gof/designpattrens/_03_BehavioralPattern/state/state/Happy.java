package com.study.gof.designpattrens._03_BehavioralPattern.state.state;

public class Happy implements State{

    @Override
    public State feelingBetter() {
        return this;
    }

    @Override
    public State feelingBad() {
        return new SoSo();
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("기분이 좋습니다");
    }
}