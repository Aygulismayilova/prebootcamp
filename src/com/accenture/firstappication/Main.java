package com.accenture.firstappication;

import java.util.Random;

public class Main {

    public static int number = 0;

    public static void main(String[] args) {

        // write your code here
        System.out.println("Hello World");
        int anotherNumber = 9;
        System.out.println("Sum of two numbers is " + (number + anotherNumber));
        String greetings = "Hello World";
        System.out.println(greetings);


        int[] anArray = new int[10];
        anArray[0] = 100;
        anArray[1] = 200;


        int[] secondArray = {100, 200, 300, 400, 500};

        for (int i = 0; i < secondArray.length; i++) {
            System.out.println(secondArray[i]);
        }
        for (int i : secondArray) {
            System.out.println(i);
        }
        createDoubleMultidimesionalArray(5);

        double[][] doubleMultiDimensionalArray = createDoubleMultidimesionalArray(5);

        printDoublesArray(doubleMultiDimensionalArray);

    }

    private static void printDoublesArray(double[][] doubleMultiDimensionalArray) {
       for (double[]row : doubleMultiDimensionalArray){
           System.out.println();
           for (double singleElement : row){
               System.out.print(singleElement+ "; ");
           }
       }
    }

    public static double[][] createDoubleMultidimesionalArray(int size) {
        double[][] twoDimensionalArray = new double[size][size];
        Random random = new Random();
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < size ; j++) {
                twoDimensionalArray[i][j] = random.nextDouble() * 10;
            }
        }
        return twoDimensionalArray;


    }
}