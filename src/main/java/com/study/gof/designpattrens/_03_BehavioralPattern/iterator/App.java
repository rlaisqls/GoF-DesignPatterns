package com.study.gof.designpattrens._03_BehavioralPattern.iterator;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {
        //서로 다른 클래스의 배열의 상세한 구현에 신경쓰지 않고 동일하게 취급할 수 있다.
        Integer[] arr = {1, 2, 3};
        ArrIterator iterator1 = new ArrIterator(arr);

        System.out.println("ArrIterator");
        while(iterator1.hasNext()){
            System.out.println(iterator1.next());
        }

        List<Integer> list = Arrays.asList(1, 2, 3);
        ListIterator iterator2 = new ListIterator(list);

        System.out.println("ListIterator");
        while(iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}