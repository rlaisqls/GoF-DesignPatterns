package com.study.gof.designpattrens._02_StructuralPatterns.adapter;

import com.study.gof.designpattrens._02_StructuralPatterns.adapter.security.UserDetails;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class AccountUserDetails implements UserDetails {

    private Account account;

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}