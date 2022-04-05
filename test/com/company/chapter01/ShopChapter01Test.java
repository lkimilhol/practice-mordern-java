package com.company.chapter01;

import static com.company.chapter01.Apple.GREEN;
import static com.company.chapter01.Apple.RED;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class ShopChapter01Test {

    private List<Apple> inventory;

    @BeforeEach
    void setup() {
        Apple redApple = new Apple(RED, 150);
        Apple greenApple = new Apple(GREEN, 250);

        inventory = new ArrayList<>();

        inventory.add(redApple);
        inventory.add(greenApple);
    }

    @DisplayName("녹색 사과 필터링")
    @Test
    void filterGreenApple() {
        // given

        // when
        // 자바8 에서는 메서드를 전달 할 수 있다가 중요.
        List<Apple> apples = ShopChapter01.filterApples(inventory, Apple::isGreenApple);

        // then
        assertEquals(1, apples.size());
    }

    @DisplayName("람다로 전달하기")
    @Test
    void lambda() {
        // given

        // when
        // 익명 함수 또는 람다로 전달.
        List<Apple> apples = ShopChapter01.filterApples(inventory, (Apple a) -> GREEN.equals(a.getColor()));

        // then
        assertEquals(1, apples.size());
    }
}