package com.study.gof.designpattrens._03_BehavioralPattern.state;

import com.study.gof.designpattrens._03_BehavioralPattern.state.state.State;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Human {
    private State state;

    public void goodSituation() {
        System.out.println("좋은 일이 생겼습니다");
        state = state.feelingBetter();
        state.printCurrentEmotion();
        System.out.println();
    }

    public void badSituation() {
        System.out.println("나쁜 일이 생겼습니다");
        state = state.feelingBad();
        state.printCurrentEmotion();
        System.out.println();
    }
}