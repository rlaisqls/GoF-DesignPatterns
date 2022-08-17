package com.study.gof.designpattrens._03_BehavioralPattern.visitor;

public class ElementA implements Element{

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}