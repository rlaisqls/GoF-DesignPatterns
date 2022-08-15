package com.study.gof.designpattrens._01_CredentialPatterns.Singleton;

public class EagerInitSingleton {

    private static EagerInitSingleton instance = new EagerInitSingleton();

    private EagerInitSingleton() {}

    public static EagerInitSingleton getInstance() {
        return instance;
    }

}