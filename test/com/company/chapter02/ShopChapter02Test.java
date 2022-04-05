package com.company.chapter02;

import static com.company.chapter01.Apple.GREEN;
import static com.company.chapter01.Apple.RED;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.company.chapter01.Apple;

class ShopChapter02Test {

    private List<Apple> inventory;

    @BeforeEach
    void setup() {
        Apple redApple = new Apple(RED, 200);
        Apple greenApple = new Apple(GREEN, 250);
        Apple greenHeavyApple = new Apple(GREEN, 1000);

        inventory = new ArrayList<>();

        inventory.add(redApple);
        inventory.add(greenApple);
        inventory.add(greenHeavyApple);
    }

    @DisplayName("녹색 사과 필터링")
    @Test
    void filterGreenApple() {
        // given

        // when
        // 자바8 에서는 메서드를 전달 할 수 있다가 중요.
        List<Apple> apples = ShopChapter02.filterApples(inventory, new AppleGreenColorPredicate());

        // then
        assertEquals(2, apples.size());
    }

    @DisplayName("무게 필터링")
    @Test
    void filterWeight() {
        // given

        // when
        // 익명 함수 또는 람다로 전달.
        List<Apple> apples = ShopChapter02.filterApples(inventory, new AppleHeavyWeightPredicate());

        // then
        assertEquals(3, apples.size());
    }

    @DisplayName("익명 클래스 사용")
    @Test
    void anonymousClass() {
        // given

        // when
        List<Apple> redApples = ShopChapter02.filterApples(inventory, new ApplePredicate() {
            @Override
            public boolean test(Apple apple) {
                return RED.equals(apple.getColor());
            }
        });

        // 위와 같은 코드
        // List<Apple> redApples = ShopChapter02.filterApples(inventory, apple -> RED.equals(apple.getColor()));

        // then
        assertEquals(1, redApples.size());
    }

    @DisplayName("제네릭을 이용")
    @Test
    void useGeneric() {
        // given

        // when
        List<Apple> redApples = ShopChapter02.filter(inventory, (Apple apple) -> RED.equals(apple.getColor()));

        // then
        assertEquals(1, redApples.size());
    }
}