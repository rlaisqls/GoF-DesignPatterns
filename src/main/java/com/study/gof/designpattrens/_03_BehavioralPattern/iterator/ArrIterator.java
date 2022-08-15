package com.study.gof.designpattrens._03_BehavioralPattern.iterator;

import lombok.RequiredArgsConstructor;

import java.util.Iterator;
import java.util.List;

@RequiredArgsConstructor
public class ArrIterator implements Iterator<Integer> {

    private final Integer[] list;
    private int position = 0;

    @Override
    public boolean hasNext() {
        return position < list.length;
    }

    @Override
    public Integer next() {
        return list[position++];
    }
}