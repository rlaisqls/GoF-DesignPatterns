package com.study.gof.designpattrens._03_BehavioralPattern.observer.publisher;

import com.study.gof.designpattrens._03_BehavioralPattern.observer.observer.Observer;

public interface Publisher<V> {
    void add(Observer<V> observer);
    void delete(Observer<V> observer);
    void notifyObserver(V message);
}