package com.study.gof.designpattrens._03_BehavioralPattern.strategy;

public class App {

    public static void main(String[] args) {
        //같은 동작을 수행하기 위한 여러 전략을 클래스로 분리하여 주입한다.
        Coupon coupon = new Coupon(new FixedDiscountStrategy());
        System.out.println("Coupon.discount(5000) = " + coupon.discount(5000));

        coupon.setDiscountStrategy(new RateDiscountStrategy());
        System.out.println("Coupon.discount(5000) = " + coupon.discount(5000));
    }
}