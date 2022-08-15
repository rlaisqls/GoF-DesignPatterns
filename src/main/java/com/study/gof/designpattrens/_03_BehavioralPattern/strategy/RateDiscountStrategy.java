package com.study.gof.designpattrens._03_BehavioralPattern.strategy;

public class RateDiscountStrategy implements DiscountStrategy {

    @Override
    public int execute(int price) {
        return price - (int)(price * 0.1);
    }
}