package com.study.gof.designpattrens._03_BehavioralPattern.strategy;

import lombok.AllArgsConstructor;
import lombok.Setter;

@Setter
@AllArgsConstructor
public class Coupon {

    private DiscountStrategy discountStrategy;

    public int discount(int price) {
        return discountStrategy.execute(price);
    }

}