package com.company.chapter02;

import static com.company.chapter01.Apple.GREEN;

import com.company.chapter01.Apple;

public class AppleGreenColorPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return GREEN.equals(apple.getColor());
    }
}
