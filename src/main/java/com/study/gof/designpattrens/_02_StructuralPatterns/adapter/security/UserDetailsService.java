package com.study.gof.designpattrens._02_StructuralPatterns.adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}