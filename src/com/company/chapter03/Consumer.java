package com.company.chapter03;

@FunctionalInterface
public interface Consumer<T> {
    void accept(T t);
}
