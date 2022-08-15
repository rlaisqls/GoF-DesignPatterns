package com.study.gof.designpattrens._02_StructuralPatterns.Proxy;

public class App {

    public static void main(String[] args) {
        //HelloService에 간접적으로 접근한다.
        HelloServiceProxy helloServiceProxy = new HelloServiceProxy();
        System.out.println(helloServiceProxy.run());
    }
}