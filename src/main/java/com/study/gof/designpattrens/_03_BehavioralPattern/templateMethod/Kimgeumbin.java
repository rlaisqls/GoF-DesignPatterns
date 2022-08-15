package com.study.gof.designpattrens._03_BehavioralPattern.templateMethod;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Kimgeumbin extends Human {

    @Override
    void Introducing() {
        System.out.println("저는 김금빈입니다 ㅎㅎ");
    }
}