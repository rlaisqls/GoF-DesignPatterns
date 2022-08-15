package com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.handler;

import com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.Request;
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