package com.snofty.ds.practice;

public class Example13 {

    private Example13() {

    }

    static int fib(int n) {
        if (n <= 0) return 0;
        else if (n == 1) {
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}
