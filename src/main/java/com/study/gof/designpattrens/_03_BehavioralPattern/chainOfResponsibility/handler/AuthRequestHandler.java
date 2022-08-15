package com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.handler;

import com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.Request;

public class AuthRequestHandler extends RequestHandler {

    public AuthRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        //대충 유저 인증하는 코드
        System.out.println("AuthRequestHandler.handle");
        super.handle(request);
    }
}