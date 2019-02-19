package com.accenture.firstappication;

import java.util.Random;
import java.util.Scanner;

public class OneDimensionalArray {
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);

        System.out.println("Enter size of array");
        int input = info.nextInt();
        long []arrayfromuser = randomFilledArray(input);
        printArray(arrayfromuser);
        printMinimalValue(arrayfromuser);
        printMaximalValue(arrayfromuser);
        printAverage(arrayfromuser);

    }

    private static void printArray(long[] arrayfromuser) {
        for(int i=0;i<arrayfromuser.length;i++){
            System.out.println(arrayfromuser[i]);
    }
                }


    private static long[] randomFilledArray(int input) {
        long[] arrayfromuser = new long[input];
        Random random = new Random();
        random.nextLong();
        for (int i = 0; i < input; i++) {
            arrayfromuser[i] = random.nextLong();

        }
        return arrayfromuser;
    }
    private static void printMinimalValue(long[]arrayfromuser){
        long minimalValue=arrayfromuser[0];
        for(long nextValue:arrayfromuser){
            if(minimalValue>=nextValue){
                minimalValue=nextValue;
            }
        }
        System.out.println("Minimal value of arrays is "+minimalValue);
    }
    private  static void printMaximalValue(long[]arrayfromuser){
        long maximalValue=arrayfromuser[0];
        for (long nextValue:arrayfromuser){
            if(nextValue>=maximalValue){
                maximalValue=nextValue;
            }
        }
    }
    private static  void printAverage(long[]arrayfromuser){
        long sum=0;
                for(long entry:arrayfromuser){
                   sum+=entry;
                }
        System.out.println("Average value : " +(sum/arrayfromuser.length));

    }
}
