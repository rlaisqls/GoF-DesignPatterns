package com.study.gof.designpattrens._03_BehavioralPattern.iterator;

import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.List;

@RequiredArgsConstructor
public class ListIterator implements Iterator<Integer> {

    private final List<Integer> list;
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Integer next() {
        return list.get(position++);
    }

}