package com.study.gof.designpattrens._02_StructuralPatterns.Adapter;

public class AccountService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);

        return account;
    }

    public Account createNewAccount(String username){
        //대충 새 유저를 생성하는 로직
        return new Account();
    }
}