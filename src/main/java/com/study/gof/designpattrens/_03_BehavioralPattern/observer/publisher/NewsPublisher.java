package com.study.gof.designpattrens._03_BehavioralPattern.observer.publisher;

import com.study.gof.designpattrens._03_BehavioralPattern.observer.observer.Observer;

import java.util.ArrayList;

public class NewsPublisher implements Publisher<String>{

    private final ArrayList<Observer<String>> observers = new ArrayList<>();

    @Override
    public void add(Observer<String> observer) {
        observers.add( observer);
    }

    @Override
    public void delete(Observer<String> observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(String message) {
        for(Observer<String> observer : observers) {
            observer.update(message);
        }
    }

}