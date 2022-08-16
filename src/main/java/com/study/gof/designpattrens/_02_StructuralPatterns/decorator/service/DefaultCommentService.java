package com.study.gof.designpattrens._02_StructuralPatterns.decorator.service;

public class DefaultCommentService implements CommentService{

    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}