package com.snofty.ds.practice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Example13Test {

    @Test
    void fib() {
        assertEquals(3, Example13.fib(4));
        assertEquals(8, Example13.fib(6));
    }
}