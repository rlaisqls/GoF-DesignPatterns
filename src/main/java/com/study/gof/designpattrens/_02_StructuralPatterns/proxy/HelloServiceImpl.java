package com.study.gof.designpattrens._02_StructuralPatterns.proxy;

public class HelloServiceImpl implements HelloService{

    @Override
    public String run() {
        return "안녕하세요";
    }
}