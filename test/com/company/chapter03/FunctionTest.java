package com.company.chapter03;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class FunctionTest {

    @Test
    void test() {
        // given
        // when
        List<Integer> list = map(Arrays.asList("lambdas", "in", "action"), (String s) -> s.length());
        // then
        assertEquals(7, list.get(0));
        assertEquals(2, list.get(1));
        assertEquals(6, list.get(2));
    }

    public <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T t : list) {
            result.add(function.apply(t));
        }
        return result;
    }
}

