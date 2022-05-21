package com.company.chapter05;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

class ReduceTest {

    @Test
    void minTest() {
        // given
        List<Integer> list = List.of(1, 2, 3, 4, 56);

        // when
        Optional<Integer> reduce = list.stream().reduce(Integer::min);

        // then
        reduce.ifPresent(integer -> assertEquals(1, integer));
    }
}
