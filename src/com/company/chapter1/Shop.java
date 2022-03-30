package com.company.chapter1;

import static com.company.chapter1.Apple.GREEN;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }



    public interface Predicate<T> {
        boolean test(T t);
    }
}
