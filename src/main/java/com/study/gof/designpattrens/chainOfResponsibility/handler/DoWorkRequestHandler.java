package com.study.gof.designpattrens.chainOfResponsibility.handler;

import com.study.gof.designpattrens.chainOfResponsibility.Request;

public class DoWorkRequestHandler extends RequestHandler {

    public DoWorkRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        //대충 request를 처리하는 코드
        System.out.println("DoWorkRequestHandler.handle");
        super.handle(request);
    }
}