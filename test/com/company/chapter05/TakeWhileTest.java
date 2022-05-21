package com.company.chapter05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

class TakeWhileTest {

    @Test
    void test() {
        // given
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // when
        long answer = list.stream()
                .takeWhile(i -> i < 6)
                .count();

        // then
        assertEquals(5, answer);
    }
}
