package com.study.gof.designpattrens._02_StructuralPatterns.Adapter.security;

public interface UserDetailsService {
    UserDetails loadUser(String username);
}