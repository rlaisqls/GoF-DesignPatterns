package com.study.gof.designpattrens._01_CredentialPatterns.factoryMethod.pizza;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public abstract class Pizza {

    String name;
    String topping;
    String sauce;

}