package com.company.chapter06;

import static java.util.stream.Collectors.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class GroupTest {

    private final List<Dish> menu = List.of(
            new Dish(Type.FISH, 100, "prawns"),
            new Dish(Type.FISH, 450, "salmon"),
            new Dish(Type.OTHER, 600, "french fries"),
            new Dish(Type.OTHER, 300, "rice"),
            new Dish(Type.OTHER, 100, "season fruit"),
            new Dish(Type.OTHER, 500, "pizza"),
            new Dish(Type.MEAT, 800, "pork"),
            new Dish(Type.MEAT, 800, "beef"),
            new Dish(Type.MEAT, 800, "chicken")
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

    @Test
    void groupingByCaloricLevelTest() {
        // given
        // when
        Map<CaloricLevel, List<Dish>> dishesByCaloricLevel = menu.stream().collect(
                groupingBy(dish -> {
                    if (dish.getCalorie() <= 400) return CaloricLevel.DIET;
                    else if (dish.getCalorie() <= 700) return CaloricLevel.NORMAL;
                    else return CaloricLevel.FAT;
                }));

        // then
        assertEquals(3, dishesByCaloricLevel.get(CaloricLevel.DIET).size());
        assertEquals(3, dishesByCaloricLevel.get(CaloricLevel.NORMAL).size());
        assertEquals(3, dishesByCaloricLevel.get(CaloricLevel.FAT).size());
    }

    @Test
    void maxByTest() {
        // given
        // when
        Map<Type, Dish> mostCaloriesByType = menu.stream()
                .collect(groupingBy(Dish::getType,
                        collectingAndThen(maxBy(Comparator.comparingInt(Dish::getCalorie))
                                , Optional::get)));

        // then
        assertEquals(450, mostCaloriesByType.get(Type.FISH).getCalorie());
        assertEquals(600, mostCaloriesByType.get(Type.OTHER).getCalorie());
        assertEquals(800, mostCaloriesByType.get(Type.MEAT).getCalorie());
    }
}

enum CaloricLevel {DIET, NORMAL, FAT}

