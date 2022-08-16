package com.study.gof.designpattrens._02_StructuralPatterns.composite;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Folder implements Composite {

    private String name;
    private List<Composite> composites;

    public Folder(String name, Composite... composites) {
        this.name = name;
        this.composites = Arrays.stream(composites)
                .collect(Collectors.toList());
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTree(String tab) {
        return "\n" +
                tab + "Folder(" + name + ") { \n" +
                tab + "  " + composites.stream().map(o -> o.getTree(tab + "    ")).collect(Collectors.toList()) + "\n" +
                tab + "} \n" +
                tab.substring(2);
    }
}