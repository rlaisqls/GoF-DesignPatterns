package com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza;

import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Sauce.Sauce;
import com.study.gof.designpattrens._01_CredentialPatterns.AbstractFactory.pizza.Topping.Topping;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public abstract class Pizza {

    private String name;
    private Sauce sauce;
    private Topping topping;
}