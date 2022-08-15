package com.study.gof.designpattrens._01_CredentialPatterns.Singleton;

public class LazyInitSingleton {

    private static LazyInitSingleton instance;

    private LazyInitSingleton() {}

    public static LazyInitSingleton getInstance() {
        if (instance == null) {
            instance = new LazyInitSingleton();
        }
        return instance;
    }

}