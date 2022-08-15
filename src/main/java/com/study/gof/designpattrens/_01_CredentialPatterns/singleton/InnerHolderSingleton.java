package com.study.gof.designpattrens._01_CredentialPatterns.Singleton;

public class InnerHolderSingleton {

    private InnerHolderSingleton() { }

    private static class SingletonHolder {
        private static final InnerHolderSingleton INSTANCE = new InnerHolderSingleton();
    }

    public static InnerHolderSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}