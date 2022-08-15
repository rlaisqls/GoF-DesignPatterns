package com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility;

import com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.handler.AuthRequestHandler;
import com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.handler.LoggingRequestHandler;
import com.study.gof.designpattrens._03_BehavioralPattern.chainOfResponsibility.handler.RequestHandler;

public class App {

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new AuthRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}