package com.study.gof.designpattrens._02_StructuralPatterns.Decorator.decorator;

import com.study.gof.designpattrens._02_StructuralPatterns.Decorator.service.CommentService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CommentDecorator implements CommentService{

    private final CommentService commentService;

    @Override
    public void addComment(String comment) {
        commentService.addComment(comment);
    }

}