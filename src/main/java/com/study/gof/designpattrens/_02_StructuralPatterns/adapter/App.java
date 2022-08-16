package com.study.gof.designpattrens._02_StructuralPatterns.adapter;

import com.study.gof.designpattrens._02_StructuralPatterns.adapter.security.LoginHandler;
import com.study.gof.designpattrens._02_StructuralPatterns.adapter.security.UserDetailsService;

public class App {

    public static void main(String[] args) {
        //서로 관련 없는 두 클래스(accountService와 UserDetailsService)를 adapt 시킨다.
        AccountService accountService = new AccountService();
        UserDetailsService userDetailsService = new AccountUserDetailsService(accountService);
        LoginHandler loginHandler = new LoginHandler(userDetailsService);

        String login = loginHandler.login("qweqwe","qweqwe@2");
        System.out.println(login);
    }
}