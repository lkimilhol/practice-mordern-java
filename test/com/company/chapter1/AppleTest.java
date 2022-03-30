package com.company.chapter1;

import static com.company.chapter1.Apple.GREEN;
import static com.company.chapter1.Apple.RED;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AppleTest {

    @DisplayName("녹색 사과 필터링")
    @Test
    void filterGreenApple() {
        // given
        Apple redApple = new Apple(RED, 150);
        Apple greenApple = new Apple(GREEN, 250);

        List<Apple> inventory = new ArrayList<>();

        inventory.add(redApple);
        inventory.add(greenApple);

        // when
        // 자바8 에서는 메서드를 전달 할 수 있다.
        List<Apple> apples = Shop.filterApples(inventory, Apple::isGreenApple);

        // then
        assertEquals(1, apples.size());
    }
}