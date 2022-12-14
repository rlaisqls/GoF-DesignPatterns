package com.study.gof.designpattrens._02_StructuralPatterns.decorator.decorator;

import com.study.gof.designpattrens._02_StructuralPatterns.decorator.service.CommentService;

public class SpamFilteringCommentDecorator extends CommentDecorator{

    public SpamFilteringCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        if(isNotSpam(comment)) super.addComment(comment);
    }

    private boolean isNotSpam(String comment) {
        return !comment.contains("http");
    }

}