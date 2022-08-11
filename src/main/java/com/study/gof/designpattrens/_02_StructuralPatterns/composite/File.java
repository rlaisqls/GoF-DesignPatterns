package com.study.gof.designpattrens._02_StructuralPatterns.composite;

import lombok.ToString;

import java.util.List;

public class File implements Composite{

    private String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getTree(String tab) {
        return "\n"
                + tab + "File : " + this.getName() + "\n"
                + tab.substring(2);
    }
}