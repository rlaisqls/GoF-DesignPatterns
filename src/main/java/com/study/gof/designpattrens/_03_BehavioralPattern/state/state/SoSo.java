package com.study.gof.designpattrens._03_BehavioralPattern.state.state;

public class SoSo implements State{

    @Override
    public State feelingBetter() {
        return new Happy();
    }

    @Override
    public State feelingBad() {
        return new Bad();
    }

    @Override
    public void printCurrentEmotion() {
        System.out.println("기분이 그저그렇습니다");
    }
}