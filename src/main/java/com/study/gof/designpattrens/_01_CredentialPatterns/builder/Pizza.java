package com.study.gof.designpattrens._01_CredentialPatterns.Builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pizza {

    String name;
    String topping;
    String sauce;

    public Pizza(String name, String topping, String sauce) {
        this.name = name;
        this.topping = topping;
        this.sauce = sauce;
    }

    public static PizzaBuilder builder() {
        return new PizzaBuilder();
    }

    public static class PizzaBuilder {

        String name;
        String topping;
        String sauce;

        PizzaBuilder(){}

        public Pizza build() {
            return new Pizza(this.name, this.topping, this. sauce);
        }

        public PizzaBuilder name(String name){
            this.name = name;
            return this;
        }

        public PizzaBuilder topping(String topping){
            this.topping = topping;
            return this;
        }

        public PizzaBuilder sauce(String sauce){
            this.sauce = sauce;
            return this;
        }

    }

}