package com.study.gof.designpattrens._03_BehavioralPattern.state;

import com.study.gof.designpattrens._03_BehavioralPattern.state.state.SoSo;

public class App {

    public static void main(String[] args) {
        //상태 객체를 설정하여 is문 등으로 확인할 필요 없이 각 상태에 맞는 로직이 실행되도록 함
        Human human = new Human(new SoSo());
        human.goodSituation();
        human.badSituation();
        human.badSituation();
    }
}