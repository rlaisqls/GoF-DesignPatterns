package com.study.gof.designpattrens.chainOfResponsibility;

import com.study.gof.designpattrens.chainOfResponsibility.handler.AuthRequestHandler;
import com.study.gof.designpattrens.chainOfResponsibility.handler.LoggingRequestHandler;
import com.study.gof.designpattrens.chainOfResponsibility.handler.RequestHandler;

public class App {

    public static void main(String[] args) {
        RequestHandler chain = new AuthRequestHandler(new LoggingRequestHandler(new AuthRequestHandler(null)));
        Client client = new Client(chain);
        client.doWork();
    }
}