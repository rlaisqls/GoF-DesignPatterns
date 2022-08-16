package com.study.gof.designpattrens._02_StructuralPatterns.decorator.decorator;

import com.study.gof.designpattrens._02_StructuralPatterns.decorator.service.CommentService;

public class TrimmingCommentDecorator extends CommentDecorator{

    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
       super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }

}