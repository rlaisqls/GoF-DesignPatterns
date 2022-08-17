package com.study.gof.designpattrens._03_BehavioralPattern.observer.observer;

public interface Observer<V> {
    void update(V content);
}