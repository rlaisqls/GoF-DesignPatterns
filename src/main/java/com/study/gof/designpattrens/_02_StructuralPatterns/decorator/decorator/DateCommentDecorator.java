package com.study.gof.designpattrens._02_StructuralPatterns.decorator.decorator;

import com.study.gof.designpattrens._02_StructuralPatterns.decorator.service.CommentService;

import java.time.LocalDateTime;

public class DateCommentDecorator extends CommentDecorator {

    public DateCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(addDate(comment));
    }

    private String addDate(String comment) {
        return comment + "["+ LocalDateTime.now() +"]";
    }

}