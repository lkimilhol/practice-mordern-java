package com.company.chapter02;

import com.company.chapter01.Apple;

// 전략 패턴
public interface ApplePredicate {
    boolean test(Apple apple);
}
