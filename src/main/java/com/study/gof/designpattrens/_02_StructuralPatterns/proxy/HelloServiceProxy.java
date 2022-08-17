package com.study.gof.designpattrens._02_StructuralPatterns.proxy;

public class HelloServiceProxy implements HelloService{

    private HelloService helloService;

    @Override
    public String run() {
        helloService = new HelloServiceImpl();
        return helloService.run();
    }
}