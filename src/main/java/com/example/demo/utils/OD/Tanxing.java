package com.example.demo.utils.OD;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Tanxing {
    public static void main(String[] args) {
        getIn();
    }
    public static void  getIn(){
        PriorityQueue<Integer> queue=new PriorityQueue<>(Comparator.comparingInt(o -> -o));
        queue.add(10);
        queue.add(20);
        System.out.println(queue);
    }
}
