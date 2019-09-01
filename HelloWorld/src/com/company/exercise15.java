package com.company;

import java.lang.reflect.Array;

public class exercise15 {
    public static void main(String[] args) {
        int min;
        int max;
        int[] myArray = {2, 6, 1, 8, 29, 234, 100, 23, -15, 42};
        int[] myReverseArray;
        min = myArray[0];
        max = myArray[0];

        if(myArray.length == 0) {
            System.out.println("tablica jest pusta");
        } else {
            for (int i = 1; i < myArray.length; i++) {
                if (myArray[i] > max) {
                    max = myArray[i];
                }
                if (myArray[i] < min) {
                    min = myArray[i];
                }
            }
            System.out.println("najmniejszy element w tablicy: " + min);
            System.out.println("najwiekszy element w tablicy: " + max);
        }

        for(int i = myArray.length -1 ; i >= 0 ; i--) {
            System.out.println("element[" + i + "]: " + myArray[i]);
        }

    }
}