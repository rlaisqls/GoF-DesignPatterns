package com.study.gof.designpattrens._02_StructuralPatterns.flyweight.ingredient;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
public class Ingredient{
    private Dough dough;
    private Sauce sauce;
}