package com.study.gof.designpattrens._03_BehavioralPattern.state.state;

import com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient.Sauce;

public interface State {
    State feelingBetter();
    State feelingBad();
    void printCurrentEmotion();
}