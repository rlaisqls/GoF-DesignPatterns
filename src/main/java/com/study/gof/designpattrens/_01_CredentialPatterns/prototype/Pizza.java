package com.study.gof.designpattrens._01_CredentialPatterns.Prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class Pizza implements Cloneable{

    String name;
    String topping;
    String sauce;

    @Override
    public Pizza clone() {
        try {
            return (Pizza) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}