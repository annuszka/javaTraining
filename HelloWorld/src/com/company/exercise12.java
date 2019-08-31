package com.company;

public class exercise12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 0;
        int i =0;
        while(i<a) {
            i++;
            c += b;
        }
        System.out.println("wynik mnozenia: " + c);

        if (b <0) {
            b = -b;
            // zrobic zeby negatywne
        }
    }
}