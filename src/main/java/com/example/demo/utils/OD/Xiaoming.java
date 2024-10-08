package com.example.demo.utils.OD;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Xiaoming {
    public static void main(String[] args) {

    }
    public void get(int[] a){

        Integer[] numbers = { 5, 1, 4, 2, 8 };

        // 使用lambda表达式进行排序
        Arrays.sort(numbers, (o1, o2) -> o2 - o1);
    }
}
