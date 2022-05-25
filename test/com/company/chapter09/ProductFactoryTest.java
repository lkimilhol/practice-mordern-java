package com.company.chapter09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ProductFactoryTest {

    @Test
    void create() {
        // given
        // when
        // then
        assertNotNull(ProductFactory.createProduct("loan"));
    }
}
