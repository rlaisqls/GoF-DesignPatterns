package com.study.gof.designpattrens._03_BehavioralPattern.strategy;

public class FixedDiscountStrategy implements DiscountStrategy {

    @Override
    public int execute(int price) {
        return price - 1000;
    }
}