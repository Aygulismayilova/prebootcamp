package com.accenture.firstappication;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("input number for factorial: ");
        int input = read.nextInt();
        System.out.println(factorial(input));
        System.out.println(recursiveFactorial(input));
    }


    private static int factorial(int number) {
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }

        return factorial;
    }

    private static int recursiveFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * recursiveFactorial(number - 1);
        }


    }
}