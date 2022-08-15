package com.study.gof.designpattrens.chainOfResponsibility.handler;

import com.study.gof.designpattrens.chainOfResponsibility.Request;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class RequestHandler {
    private RequestHandler nextHandler;

    public void handle(Request request) {

        if (nextHandler != null){
            nextHandler.handle(request);
        }
    }

}