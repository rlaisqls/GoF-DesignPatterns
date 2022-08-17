package com.study.gof.designpattrens._03_BehavioralPattern.state.state;

public class Bad implements State{

    @Override
    public State feelingBetter() {
        return new SoSo();
    }

    @Override
    public State feelingBad() {
        return this;
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("기분이 좋지 않습니다");
    }
}