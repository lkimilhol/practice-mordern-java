package com.company.chapter03;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class PredicateTest {

    @Test
    void test() {
        // given
        List<String> listOfString = List.of("", "test", "test2");

        // when
        Predicate<String> nonEmptyStringPredicate = (String s) -> !s.isEmpty();
        List<String> nonEmpty = filter(listOfString, nonEmptyStringPredicate);

        // then
        assertEquals(2, nonEmpty.size());
    }

    public <T> List<T> filter(List<T> list, Predicate<T> p) {
        List<T> results = new ArrayList<>();
        for (T t : list) {
            if (p.test(t)) {
                results.add(t);
            }
        }
        return results;
    }
}
