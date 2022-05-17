package com.company.chapter03;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

public class ConsumerTest {
    @Test
    void test() {
        // given
        // when
        this.foreach(Arrays.asList(1, 2, 3, 4, 5), (Integer i) -> System.out.println(i));
        // then
        assertTrue(true);
    }

    public <T> void foreach(List<T> list, Consumer<T> consumer) {
        for (T t : list) {
            consumer.accept(t);
        }
    }
}
