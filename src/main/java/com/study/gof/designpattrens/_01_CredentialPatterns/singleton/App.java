package com.study.gof.designpattrens._01_CredentialPatterns.singleton;

public class App {

    public static void main(String[] args) {

        //두 객체가 같은 인스턴스임을 보장한다.
        LazyInitSingleton lazyInitSingleton1 = LazyInitSingleton.getInstance();
        LazyInitSingleton lazyInitSingleton2 = LazyInitSingleton.getInstance();

        System.out.println(lazyInitSingleton1 == lazyInitSingleton2);

        EagerInitSingleton eagerInitSingleton1 = EagerInitSingleton.getInstance();
        EagerInitSingleton eagerInitSingleton2 = EagerInitSingleton.getInstance();

        System.out.println(eagerInitSingleton1 == eagerInitSingleton2);

        InnerHolderSingleton staticSingleton1 = InnerHolderSingleton.getInstance();
        InnerHolderSingleton staticSingleton2 = InnerHolderSingleton.getInstance();

        System.out.println(staticSingleton1 == staticSingleton2);

        EnumSingleton enumSingleton1 = EnumSingleton.INSTANCE;
        EnumSingleton enumSingleton2 = EnumSingleton.INSTANCE;

        System.out.println(enumSingleton1 == enumSingleton2);

    }

}