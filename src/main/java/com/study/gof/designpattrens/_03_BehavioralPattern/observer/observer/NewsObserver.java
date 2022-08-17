package com.study.gof.designpattrens._03_BehavioralPattern.observer.observer;

import com.study.gof.designpattrens._03_BehavioralPattern.observer.publisher.Publisher;

public class NewsObserver implements Observer<String> {

    private Publisher<String> publisher;

    public NewsObserver(Publisher<String> publisher) {
        this.publisher = publisher;
        publisher.add(this);
    }

    @Override
    public void update(String message) {
        display(message);
    }

    public void withdraw() {
        publisher.delete(this);
    }

    public void display(String message) {
        System.out.println("뉴스");
        System.out.println("->" + message);
    }
}