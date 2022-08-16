package com.study.gof.designpattrens._02_StructuralPatterns.decorator;

import com.study.gof.designpattrens._02_StructuralPatterns.decorator.decorator.DateCommentDecorator;
import com.study.gof.designpattrens._02_StructuralPatterns.decorator.decorator.SpamFilteringCommentDecorator;
import com.study.gof.designpattrens._02_StructuralPatterns.decorator.decorator.TrimmingCommentDecorator;
import com.study.gof.designpattrens._02_StructuralPatterns.decorator.service.CommentService;
import com.study.gof.designpattrens._02_StructuralPatterns.decorator.service.DefaultCommentService;

public class App {

    private static final boolean enabledSpamFilter = true;
    private static final boolean enabledTrimming = true;
    private static final boolean enabledDate = true;

    public static void main(String[] args) {
        //Decorator를 프로그램 동작 중에 동적으로 추가할 수 있다
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) commentService = new SpamFilteringCommentDecorator(commentService);
        if (enabledTrimming) commentService = new TrimmingCommentDecorator(commentService);
        if (enabledDate) commentService = new DateCommentDecorator(commentService);

        commentService.addComment("ㅇㄹㄴㅇㄹㄴ");
        commentService.addComment("ㅏㅓㅑㅐ...............");
        commentService.addComment("https");
    }
}