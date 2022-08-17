package com.study.gof.designpattrens._03_BehavioralPattern.visitor;

import lombok.NoArgsConstructor;

public class Visitor {

    public void visit(ElementA element) {
        System.out.println("ElementA가 방문함");
    }

    public void visit(ElementB element) {
        System.out.println("ElementB가 방문함");
    }
}