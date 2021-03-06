package com.rybetsky;

import com.rybetsky.service.math.FibonacciService;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        inputHandler();
    }

    private static void inputHandler() {
        System.out.println("Hello!");
        printMessages();
        String in = inputString();
        while (!"0".equals(in)) {
            if("1".equals(in)) {
                countFibonacci();
            } else {
                System.out.println("No such option!");
            }
            printMessages();
            in = inputString();
        }
        System.out.println("Well done! Good Bye! :)");
    }

    private static void countFibonacci() {
        System.out.println("Enter the number of Fibonacci sequence element:");
        String in = inputString();
        try {
            int n = Integer.parseInt(in);
            int fiboResult = FibonacciService.computeAnElementAt(n);
            System.out.println(fiboResult);
        } catch (NumberFormatException nfe) {
            System.out.println("Please, type only numeric symbols");
        } catch (IllegalArgumentException iae) {
            System.out.println(iae.getMessage());
        }

    }

    private static void printMessages() {
        System.out.println("  Enter 1 to compute N-th Fibonacci number.");
        System.out.println("  Enter 0 to Exit.");
    }

    private static String inputString() {
        return new Scanner(System.in).nextLine();
    }
}
