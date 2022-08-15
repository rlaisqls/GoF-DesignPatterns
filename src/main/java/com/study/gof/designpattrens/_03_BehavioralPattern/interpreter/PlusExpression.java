package com.study.gof.designpattrens._03_BehavioralPattern.interpreter;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class PlusExpression implements Expression{

    @Override
    public Integer interpret(String context) {
        if (context.contains("+")) {
            try {
                String[] split = context.split("\\+", 2);
                return Integer.parseInt(split[0]) + Integer.parseInt(split[1]);
            } catch (Exception e) {
                return null;
            }
        } else {
            return null;
        }
    }
}