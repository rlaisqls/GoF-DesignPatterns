package com.study.gof.designpattrens._03_BehavioralPattern.templateMethod;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Kimeunbin extends Human {

    @Override
    void Introducing() {
        System.out.println("저는 김은빈입니다 ^^");
    }
}