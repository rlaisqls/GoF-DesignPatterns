package com.study.gof.designpattrens._03_BehavioralPattern.observer;

import com.study.gof.designpattrens._03_BehavioralPattern.observer.observer.NewsObserver;
import com.study.gof.designpattrens._03_BehavioralPattern.observer.publisher.NewsPublisher;

public class App {

    public static void main(String[] args) {

        NewsPublisher newsPublisher = new NewsPublisher();
        NewsObserver newsObserver = new NewsObserver(newsPublisher);

        newsPublisher.notifyObserver("[속보] 큰일남");

        newsObserver.withdraw();

        newsPublisher.notifyObserver("[속보] 완전 큰일남");
    }
}