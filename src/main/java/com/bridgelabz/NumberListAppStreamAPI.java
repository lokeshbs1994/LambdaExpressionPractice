package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class NumberListAppStreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(6);
        // UC2.1 creating stream  and Iterate the Each item to show each element of stream
        list.stream().forEach(item -> System.out.println(item));

        // UC2.2 converting and Storing
        List<Double> doubleList = new ArrayList<>(); // for storing
        Function<Integer, Double> doubleFunction = (n) -> n.doubleValue();
        doubleList = list.stream().map(doubleFunction).collect(Collectors.toList());
        System.out.println(doubleList);
    }
}