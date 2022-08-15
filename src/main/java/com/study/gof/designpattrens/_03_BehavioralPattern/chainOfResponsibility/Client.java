package com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility;

import com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.handler.RequestHandler;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Client {

    private final RequestHandler requestHandler;

    public void doWork() {
        Request request = new Request();
        requestHandler.handle(request);
    }
}