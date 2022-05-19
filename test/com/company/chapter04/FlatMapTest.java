package com.company.chapter04;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;

class FlatMapTest {

    @Test
    void test() {
        // given
        List<Map<String, List<Integer>>> test = new ArrayList<>();
        List<Integer> inner = List.of(1, 2, 3, 4, 5);
        test.add(Map.of("inner", inner));

        // when
        long count = test.stream()
                .flatMap(e -> e.get("inner").stream().map(i -> i * 2))
                .filter(e -> e > 5)
                .count();

        // then
        assertEquals(3, count);
    }
}
