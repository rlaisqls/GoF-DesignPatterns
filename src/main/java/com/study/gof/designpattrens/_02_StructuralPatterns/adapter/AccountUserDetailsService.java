package com.study.gof.designpattrens._02_StructuralPatterns.Adapter;

import com.study.gof.designpattrens._02_StructuralPatterns.Adapter.security.UserDetails;
import com.study.gof.designpattrens._02_StructuralPatterns.Adapter.security.UserDetailsService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class AccountUserDetailsService implements UserDetailsService {

    private final AccountService accountService;

    @Override
    public UserDetails loadUser(String username) {

        Account account = accountService.findAccountByUsername(username);

        return new AccountUserDetails(account);
    }
}