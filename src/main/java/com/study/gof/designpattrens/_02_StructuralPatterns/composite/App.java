package com.study.gof.designpattrens._02_StructuralPatterns.Composite;

public class App {

    public static void main(String[] args) {
        //전체와 일부를 동일하게 취급할 수 있다.
        Folder folder =
                new Folder("root node",
                        new Folder("internal node",
                                new File("leaf node")));

        System.out.println("folder.toString() = " + folder.getTree("  "));
    }
}