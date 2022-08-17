package com.study.gof.designpattrens._03_BehavioralPattern.visitor;

public class ElementB implements Element{

    @Override
    public void visit(Visitor visitor) {
        visitor.visit(this);
    }
}