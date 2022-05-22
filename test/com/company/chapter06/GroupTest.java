package com.company.chapter06;

import static java.util.stream.Collectors.groupingBy;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class GroupTest {

    private final List<Dish> menu = List.of(
            new Dish(Type.FISH, 100, "prawns"),
            new Dish(Type.FISH, 200, "salmon"),
            new Dish(Type.OTHER, 300, "french fries"),
            new Dish(Type.OTHER, 300, "rice"),
            new Dish(Type.OTHER, 100, "season fruit"),
            new Dish(Type.OTHER, 400, "pizza"),
            new Dish(Type.MEAT, 500, "pork"),
            new Dish(Type.MEAT, 500, "beef"),
            new Dish(Type.MEAT, 500, "chicken")
    );

    @Test
    void groupingByTest() {
        // given
        // when
        Map<Type, List<Dish>> dishesByType = menu.stream().collect(groupingBy(Dish::getType));

        // then
        assertEquals(2, dishesByType.get(Type.FISH).size());
        assertEquals(4, dishesByType.get(Type.OTHER).size());
        assertEquals(3, dishesByType.get(Type.MEAT).size());
    }
}
