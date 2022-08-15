package com.study.gof.designpattrens.chainOfResponsibility.handler;

import com.study.gof.designpattrens.chainOfResponsibility.Request;

public class LoggingRequestHandler extends RequestHandler {

    public  LoggingRequestHandler(RequestHandler nextHandler) {
        super(nextHandler);
    }

    @Override
    public void handle(Request request) {
        //대충 요청을 로깅하는 코드
        System.out.println("LoggingRequestHandler.handle");
        super.handle(request);
    }
}