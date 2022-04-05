package com.company.chapter01;

import java.util.ArrayList;
import java.util.List;

public class ShopChapter01 {
    public static List<Apple> filterApples(List<Apple> inventory, Predicate<Apple> p) {
        List<Apple> result = new ArrayList<>();

        for (Apple apple : inventory) {
            if (p.test(apple)) {
                result.add(apple);
            }
        }

        return result;
    }

    // 명확히 하기 위해 추가. 이 인터페이스 선언이 없으면 java.util.function에서 import 됨
    public interface Predicate<T> {
        boolean test(T t);
    }
}
