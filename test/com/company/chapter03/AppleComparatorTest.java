package com.company.chapter03;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import com.company.chapter01.Apple;

class AppleComparatorTest {

    @Test
    void test() {
        // given
        List<Apple> inventory = new ArrayList<>();
        inventory.add(new Apple(Apple.RED, 5));
        inventory.add(new Apple(Apple.RED, 9));
        inventory.add(new Apple(Apple.RED, 2));
        inventory.add(new Apple(Apple.RED, 7));
        inventory.add(new Apple(Apple.RED, 1));
        inventory.add(new Apple(Apple.RED, 4));

        // when
        inventory.sort(new AppleComparator());

        // then
        assertEquals(1, inventory.get(0).getWeight());
        assertEquals(2, inventory.get(1).getWeight());
        assertEquals(4, inventory.get(2).getWeight());
        assertEquals(5, inventory.get(3).getWeight());
        assertEquals(7, inventory.get(4).getWeight());
        assertEquals(9, inventory.get(5).getWeight());
    }
}