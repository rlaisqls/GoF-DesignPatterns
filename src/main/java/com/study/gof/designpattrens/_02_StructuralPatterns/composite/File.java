package com.study.gof.designpattrens._02_StructuralPatterns.Composite;

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