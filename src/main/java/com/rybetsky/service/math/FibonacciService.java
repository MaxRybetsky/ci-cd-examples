package com.rybetsky.service.math;

public class FibonacciService {
    public static int computeAnElementAt(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("Argument should be strong positive");
        }
        if (n == 1) {
            return 0;
        }
        if (n == 2) {
            return 1;
        }
        return computeAnElementAt(n - 1) + computeAnElementAt(n - 2);
    }
}
